package com.example.qr;


import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSend extends AsyncTask<String,Void,Void>
{
    static String ipAddress;

    Socket s;
    DataOutputStream dos;
    PrintWriter pw;
    @Override
    protected Void doInBackground(String... voids) {
        String message = voids[0];
        try{
            ipAddress=MainActivity.ipAddress;
            s =new Socket(ipAddress,20000);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            s.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
