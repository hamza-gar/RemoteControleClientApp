package com.example.qr;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;

import java.io.ByteArrayOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class parammeter extends AppCompatActivity {
AudioManager audioManager;
SeekBar seekBar;
MediaPlayer player;
    static String phoneIpAddress;
    private String toSend;
    private static final int SAMPLE_RATE = 48000; // Hertz
    private static final int SAMPLE_INTERVAL = 5; // Milliseconds
    private static final int SAMPLE_SIZE = 16; // Bytes
    private static final int BUF_SIZE = SAMPLE_INTERVAL * SAMPLE_INTERVAL * SAMPLE_SIZE * 2; //Bytes

    private static final int port = 50005;


    private boolean speaker = false;
    static Thread receiveThread;

    private static Button button;

    int chunkSize;
    byte[] chunk = new byte[2048];
    ByteArrayOutputStream outBuffer = new ByteArrayOutputStream();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        phoneIpAddress = MainActivity.phoneIpAddress;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parammeter);
        ConstraintLayout myLayout = (ConstraintLayout)findViewById(R.id.myLayout);
        Button connectButton = (Button)findViewById(R.id.connectBut);


        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, PackageManager.PERMISSION_GRANTED);
        seekBar=findViewById(R.id.seekBar);
        audioManager = (AudioManager) getSystemService(this.AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
        int currentVolume =audioManager.getStreamVolume(audioManager.STREAM_MUSIC);

        seekBar.setMax(maxVolume);

        seekBar.setProgress(currentVolume);
        /////

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,i,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
//        connectButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                send(view);
//                System.out.println( phoneIpAddress);
//            }
//        });
        Button button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMain();
            }
        });
    }
    public void send(View v){
        phoneAddSender messageSend = new phoneAddSender();
        messageSend.execute(phoneIpAddress);
    }

    public void stopSpeaker(View view){
        speaker = false;
        receiveThread.interrupt();
    }
    public void startSpeaker(View view) {
        if (!speaker) {
            speaker = true;
             receiveThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Instance Of AudioTrack
                    AudioTrack track = new AudioTrack(AudioManager.STREAM_MUSIC, SAMPLE_RATE, AudioFormat.CHANNEL_OUT_MONO,
                            AudioFormat.ENCODING_PCM_16BIT, BUF_SIZE, AudioTrack.MODE_STREAM);

                    track.play();
                    try {
                        DatagramSocket socket = new DatagramSocket(port);
                        byte[] buf = new byte[BUF_SIZE];
                        while (speaker){
                            DatagramPacket packet = new DatagramPacket(buf,BUF_SIZE);
                            socket.receive(packet);
                            track.write(packet.getData(),0,BUF_SIZE);
                        }
                        socket.disconnect();
                        socket.close();
                        track.stop();
                        track.flush();
                        track.release();
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            receiveThread.start();
        } else {
            stopSpeaker(view);
        }
    }
    public void backToMain(){
        speaker=true;
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}