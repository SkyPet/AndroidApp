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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Android In-Process Node");
        final TextView textbox = (TextView) findViewById(R.id.textbox);

        Context ctx = new Context();

        try {
            //Geth.newN
            Node node = Geth.newNode(getFilesDir() + "/.ethereum", new NodeConfig());
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
            textbox.append("Imp: " + impAcc.getAddress().getHex() + "\n\n");
            Address myContract = Geth.newAddressFromHex("0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8");
            Geth.bindContract(myContract, "0x69De4ADbb566c1c68e8dB1274229adA4A3D9f8A8", andtheclient);*/
            //Geth.newEthereumClient()
            NodeInfo info = node.getNodeInfo();

            textbox.append("My name: " + info.getName() + "\n");
            textbox.append("My address: " + info.getListenerAddress() + "\n");
            textbox.append("My protocols: " + info.getProtocols() + "\n\n");

            EthereumClient ec = node.getEthereumClient();
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