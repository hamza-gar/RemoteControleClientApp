package com.example.qr;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class keyBoard extends AppCompatActivity {
    static String toSend;
    static int k;
    boolean right=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_board);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();
        Button button = (Button) findViewById(R.id.button6);
        Button aBut = (Button) findViewById(R.id.aBut);
        Button bBut = (Button) findViewById(R.id.bBut);
        Button cBut = (Button) findViewById(R.id.cBut);
        Button dBut = (Button) findViewById(R.id.dBut);
        Button eBut = (Button) findViewById(R.id.eBut);
        Button fBut = (Button) findViewById(R.id.fBut);
        Button gBut = (Button) findViewById(R.id.gBut);
        Button hBut = (Button) findViewById(R.id.hBut);
        Button iBut = (Button) findViewById(R.id.iBut);
        Button jBut = (Button) findViewById(R.id.jBut);
        Button kBut = (Button) findViewById(R.id.kBut);
        Button lBut = (Button) findViewById(R.id.lBut);
        Button mBut = (Button) findViewById(R.id.mBut);
        Button nBut = (Button) findViewById(R.id.nBut);
        Button oBut = (Button) findViewById(R.id.oBut);
        Button pBut = (Button) findViewById(R.id.pBut);
        Button qBut = (Button) findViewById(R.id.qBut);
        Button rBut = (Button) findViewById(R.id.rBut);
        Button sBut = (Button) findViewById(R.id.sBut);
        Button tBut = (Button) findViewById(R.id.tBut);
        Button vBut = (Button) findViewById(R.id.vBut);
        Button wBut = (Button) findViewById(R.id.wBut);
        Button xBut = (Button) findViewById(R.id.xBut);
        Button yBut = (Button) findViewById(R.id.yBut);
        Button zBut = (Button) findViewById(R.id.zBut);
        Button uBut = (Button) findViewById(R.id.uBut);
        Button But0 = (Button) findViewById(R.id.But0);
        Button But1 = (Button) findViewById(R.id.But1);
        Button But2 = (Button) findViewById(R.id.But2);
        Button But3 = (Button) findViewById(R.id.But3);
        Button But4 = (Button) findViewById(R.id.But4);
        Button But5 = (Button) findViewById(R.id.But5);
        Button But6 = (Button) findViewById(R.id.But6);
        Button But7 = (Button) findViewById(R.id.But7);
        Button But8 = (Button) findViewById(R.id.But8);
        Button But9 = (Button) findViewById(R.id.But9);
        Button But = (Button) findViewById(R.id.But);
        Button ButPlus = (Button) findViewById(R.id.ButPlus);
        Button minus = (Button) findViewById(R.id.minus);
        Button shiftBut = (Button) findViewById(R.id.shiftBut);
        Button deleteBut = (Button) findViewById(R.id.deleteBut);
        Button enterBut = (Button) findViewById(R.id.enterBut);
        Button slash = (Button) findViewById(R.id.slash);
        Button ButSpace = (Button) findViewById(R.id.ButSpace);
        Button ButPoint = (Button) findViewById(R.id.ButPoint);
        Button ButPointCommon = (Button) findViewById(R.id.ButPointCommon);
        Button ButCommon = (Button) findViewById(R.id.ButCommon);
        Button ButSingle = (Button) findViewById(R.id.ButSingle);
        Button ButMultiple = (Button) findViewById(R.id.ButMultiple);
        Button multiple = (Button) findViewById(R.id.multiple);
        Button ButtabOp = (Button) findViewById(R.id.ButtabOp);
        Button tableEndBut = (Button) findViewById(R.id.tableEndBut);
        Button ButTwoPoint = (Button) findViewById(R.id.ButTwoPoint);
        Button Butinf = (Button) findViewById(R.id.Butinf);
        Button Butsup = (Button) findViewById(R.id.Butsup);

        //----------------------=----------------------//
        But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 61;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-//
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 45;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------+-------------------------//
        ButPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 43;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //---------------------space-----------------------//
        ButSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 32;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //---------------------*-----------------------//
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 42;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------:-----------------------//
        ButTwoPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 58;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------enter-----------------------//
        enterBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 13;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------shift---------------------//
        shiftBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 16;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------.-----------------------//
        ButPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 46;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------,-----------------------//
        ButCommon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 44;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------;-----------------------//
        ButPointCommon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 59;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------]-----------------------//
        tableEndBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 93;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------'-----------------------//
        ButSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 39;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------"-----------------------//
        ButMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 34;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------/-----------------------//
        slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 47;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------[-----------------------//
        ButtabOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 91;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------<-----------------------//
        Butinf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 60;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //---------------------->-----------------------//
        Butsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 62;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------s-----------------------//
        sBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 115;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------d-----------------------//
        dBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 100;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------f-----------------------//
        fBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 102;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------g-----------------------//
        gBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 103;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------h-----------------------//
        hBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 104;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------j-----------------------//
        jBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 106;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------k-----------------------//
        kBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 107;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------l-----------------------//
        lBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 108;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------z-----------------------//
        zBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 122;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------x-----------------------//
        xBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 120;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------c-----------------------//
        cBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 99;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------q-----------------------//
        qBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 113;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------e-----------------------//
        eBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 101;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //--------------------r-------------------------//
        rBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 114;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //---------------------t------------------------//
        tBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 116;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------w-----------------------//
        wBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 119;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------y-----------------------//
        yBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 121;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------u----------------------//
        uBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 117;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------i----------------------//
        iBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 105;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------p----------------------//
        pBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 112;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------o----------------------//
        oBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 111;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------a----------------------//
        aBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 97;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //-----------------------0---------------------//
        But0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 0;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------2-----------------------//
        But2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 2;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------3-----------------------//
        But3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 3;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------6-----------------------//
        But6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 6;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------5-----------------------//
        But5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 5;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------4-----------------------//
        But4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 4;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------7-----------------------//
        But7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 7;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------8-----------------------//
        But8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 8;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------1-----------------------//
        But1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 1;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------9-----------------------//
        But9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 9;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------delete-----------------------//
        deleteBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 10;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------v-----------------------//
        vBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 118;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------b-----------------------//
        bBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 98;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------n-----------------------//
        nBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 110;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
                Log.i("TouchEvents", String.valueOf(k));
            }
        });
        //----------------------m-----------------------//
        mBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right=view.isPressed();
                if(right) {
                    k = 109;
                    toSend=String.valueOf(k);
                }else{
                    k=-1;
                    toSend=String.valueOf(k);
                }
                send(view);
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
        MessageSend messageSend = new MessageSend();
        messageSend.execute(toSend);
    }
  
}