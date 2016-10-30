package com.example.dstahl.gethagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import com.example.dstahl.gethagain.SkyPet;
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
            //nodes.set(0, Geth.newEnode("enode://d72af45ba9b60851a8077a4eb07700484b585e5f2e55024e0c93b7ec7d114f2e3fa3c8f3a3358f89da00a609f5a062415deb857ada863b8cdad02b0b0bc90da3@50.112.52.169:30301"));
            nodes.set(0, Geth.newEnode("enode://b8d29479eb403aa190ecc45157c74535a4015e00a4162a45a7d5e5110d4bf025bff3a65267d086d937a9bf5f45b08329bac6b1029f28eef3337411f38ec9bf81@162.243.63.248:30303"));
            //enode://e58d5e26b3b630496ec640f2530f3e7fa8a8c7dfe79d9e9c4aac80e3730132b869c852d3125204ab35bb1b1951f6f2d40996c1034fd8c5a69b383ee337f02ddc@92.51.165.126:30303

            config.setBootstrapNodes(nodes);
            config.setEthereumChainConfig(Geth.getTestnetChainConfig());
            config.setEthereumGenesis(Geth.getTestnetGenesis());
            config.setEthereumTestnetNonces(true);
            config.setEthereumNetworkID(TESTNET_NETWORK_ID);//
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
            Node node;//= Geth.newNode(getFilesDir() + "/.ethereum", new NodeConfig());
            //Geth.newN
            if(USE_TESTNET){
                node = Geth.newNode(getFilesDir() + "/.ethereum", createTestnetConfiguration());
            }
            else {
                node = Geth.newNode(getFilesDir() + "/.ethereum", new NodeConfig());
            }
            node.start();




            NodeInfo info = node.getNodeInfo();


            textbox.append("My name: " + info.getName() + "\n");
            textbox.append("My address: " + info.getListenerAddress() + "\n");
            textbox.append("My protocols: " + info.getProtocols() + "\n\n");




            EthereumClient ec = node.getEthereumClient();

            /*Address myAddress = Geth.newAddressFromHex("0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8");
            SkyPet myContract=new SkyPet(myAddress, ec);
            String myTestHash="0xf65cbc6391f5a2834478811d9c811b83f51fda4fc030462b9c08776fb6d78751";
            BigInt myInt=myContract.trackNumberRecords(null, myTestHash.getBytes());
            textbox.append("myint: "+myInt);*/
            textbox.append("Latest block: " + ec.getBlockByNumber(ctx, -1).getNumber() + ", syncing...\n");
            Address myAddress = Geth.newAddressFromHex("0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8");
            SkyPet myContract=new SkyPet(myAddress, ec);
            //String myTestHash="0xa665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3";
            BigInt myInt=myContract.costToAdd(null);
            textbox.append("Cost Of Ether: "+myInt.toString());
            
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