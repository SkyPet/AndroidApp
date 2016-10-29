package com.example.dstahl.gethagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/
import org.ethereum.geth.*;

public class MainActivity extends AppCompatActivity {
    private final static int TESTNET_NETWORK_ID = 2;
    private final static boolean USE_TESTNET=true;
    private NodeConfig createTestnetConfiguration() {
        Enodes nodes = new Enodes(1);
        NodeConfig config = new NodeConfig();
        try {
            nodes.set(0, Geth.newEnode("enode://d72af45ba9b60851a8077a4eb07700484b585e5f2e55024e0c93b7ec7d114f2e3fa3c8f3a3358f89da00a609f5a062415deb857ada863b8cdad02b0b0bc90da3@50.112.52.169:30301"));
            config.setBootstrapNodes(nodes);
            config.setEthereumChainConfig(Geth.getTestnetChainConfig());
            config.setEthereumGenesis(Geth.getTestnetGenesis());
            config.setEthereumTestnetNonces(true);
            config.setEthereumNetworkID(TESTNET_NETWORK_ID);
            config.setMaxPeers(25);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return config;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Android In-Process Node");
        final TextView textbox = (TextView) findViewById(R.id.textbox);

        Context ctx = new Context();

        try {
            Node node;
            //Geth.newN
            if(USE_TESTNET){
                node = Geth.newNode(getFilesDir() + "/.ethereum", createTestnetConfiguration());//new NodeConfig());
            }
            else{
                node = Geth.newNode(getFilesDir() + "/.ethereum",new NodeConfig());
            }
            node.start();

            //Geth.bindContract()
           /* AccountManager am = Geth.newAccountManager(getFilesDir()+"/.ethereum", Geth.LightScryptN, Geth.LightScryptP);
            Account newAcc = am.newAccount("Creation password");
            textbox.append("New: " + newAcc.getAddress().getHex() + "\n\n");
            byte[] jsonAcc = am.exportKey(newAcc, "Creation password", "Export password");
            textbox.append("Json: " + new String(jsonAcc) + "\n\n");

            am.deleteAccount(newAcc, "Creation password");
            textbox.append("Accs: " + am.getAccounts().size() + "\n\n");

            Account impAcc = am.importKey(jsonAcc, "Export password", "Import password");
            textbox.append("Imp: " + impAcc.getAddress().getHex() + "\n\n");*/
            EthereumClient ec = node.getEthereumClient();
            Address myContract = Geth.newAddressFromHex("0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8");
            BoundContract SkyPet=Geth.bindContract(myContract, "0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8", ec);
            //Geth.newEthereumClient()
            //CallMsg msg=Geth.newCallMsg();

            NodeInfo info = node.getNodeInfo();

            textbox.append(SkyPet.toString()+"\n");
           // ReleaseOracle ro = new ReleaseOracle(myContract, ec);
           // ec.callContract(ctx, msg, -1);
            //SkyPet.trackNumberRecords(hashId).c[0];
            //CallOpts cO=Geth.newCallOpts();
            //cO.setContext(ctx);//is this necessary?
            //Interfaces iFs=Geth.newInterfaces(1);
            //iFs.
            //iF.setAddress(myContract);
            //SkyPet.call(cO, iF, "trackNumberRecords", iF);
            //SkyPet.call()

            textbox.append("My name: " + info.getName() + "\n");
            textbox.append("My address: " + info.getListenerAddress() + "\n");
            textbox.append("My protocols: " + info.getProtocols() + "\n\n");


            textbox.append("Latest block: " + ec.getBlockByNumber(ctx, -1).getNumber() + ", syncing...\n");
            //Address myContract = Geth.newAddressFromHex("0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8");
            //ec.callContract()
            //Geth.bindContract(myContract, "0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8", ec);
            //callMsg?
            //Geth.
           // ec.callContract(ctx, )

            NewHeadHandler handler = new NewHeadHandler() {
                @Override public void onError(String error) { }
                @Override public void onNewHead(final Header header) {
                    MainActivity.this.runOnUiThread(new Runnable() {
                        public void run() { textbox.append("#" + header.getNumber() + ": " + header.getHash().getHex().substring(0, 10) + "…\n"); }
                    });
                }
            };
            ec.subscribeNewHead(ctx, handler,  16);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sendMessage(View view) {
        // Do something in response to button
    }
}