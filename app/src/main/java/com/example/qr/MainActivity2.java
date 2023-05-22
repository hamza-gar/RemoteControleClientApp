package com.example.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView ;
    static String ipAddress;
    static String phoneIpAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ipAddress = getIntent().getStringExtra("ipAddress");

        Button button =(Button) findViewById(R.id.button2);
        Button button2 =(Button) findViewById(R.id.button3);
        Button button3 =(Button) findViewById(R.id.button4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,mouse.class);
        intent.putExtra("ipAddress",ipAddress);
        intent.putExtra("phoneIp",phoneIpAddress);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this,keyBoard.class);
        intent.putExtra("ipAddress",ipAddress);
        intent.putExtra("phoneIp",phoneIpAddress);

        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this,parammeter.class);
        intent.putExtra("ipAddress",ipAddress);
        intent.putExtra("phoneIp",phoneIpAddress);
        startActivity(intent);
    }

}