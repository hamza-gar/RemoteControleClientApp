package com.example.qr;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Vector;

public class mouse extends AppCompatActivity {
    static String phoneIpAddress;
    private String toSend;
    EditText e1;
    int x;
    int y;
    Vector<Integer> x1;
    boolean right=false;
    boolean clicked=false;
    String rB;
    String left;
    String toS;
    static int k;
    boolean touched=false;
    private VelocityTracker vtrack  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouse);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button7);
        Button button3 = (Button)findViewById(R.id.button8);
        ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.main_Layout);
        /////////
        phoneIpAddress = getIntent().getStringExtra("phoneIp");
        /////////
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                x = (int)motionEvent.getX();
                y = (int)motionEvent.getY();
                toSend = String.valueOf(x) + "/" + String.valueOf(y);

                Log.i("TouchEvents", toSend.toString());
                send(view);
                return true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                right=v.isPressed();
                if(right) {
                    k = 1;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);

                }
                send(v);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                right=v.isPressed();
                if(right) {
                    k = 2;
                    toSend=String.valueOf(k);

                }else{
                    k=-1;
                    toSend=String.valueOf(k);

                }
                send(v);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMain();
            }
        });
    }
    public void backToMain(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void send(View v){
        MessageSender messageSend = new MessageSender();
        messageSend.execute(toSend);
    }
}