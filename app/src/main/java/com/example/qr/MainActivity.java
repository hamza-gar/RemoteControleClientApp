package com.example.qr;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.widget.Button;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class MainActivity extends AppCompatActivity {

    Button btn;
    static boolean isTrue=false;
    static String ipAddress;
    static String phoneIpAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //get phone address
        WifiManager wifiManager = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        phoneIpAddress= Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
        ////
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn_scan);
        btn.setOnClickListener(v->{
            scanCode();
        });

    }
    private void scanCode(){
        ScanOptions options = new ScanOptions();
        options.setPrompt("Volume up to flash on");
        options.setBeepEnabled(true);
        options.setOrientationLocked(true);
        options.setCaptureActivity(CaptureAct.class);
        barLaucher.launch(options);
        isTrue=true;
    }
    ActivityResultLauncher<ScanOptions>barLaucher=registerForActivityResult(new ScanContract(), result->{
        if(result.getContents()!=null)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            ipAddress=result.getContents();

            if(isTrue){
                GO();
            }
        }
    });

    public void GO(){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("ipAddress",ipAddress);
        intent.putExtra("phoneIp",phoneIpAddress);
        startActivity(intent);
    }
}