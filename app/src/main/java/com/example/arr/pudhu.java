package com.example.arr;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class pudhu extends AppCompatActivity {

    Button playBtn;
    SeekBar positionBar;
    TextView elapse, remain;
    MediaPlayer mp;
    int totalTime;
    TextView lyric;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pudhu);
        lyric=findViewById(R.id.lyric4);
        String s="Pudhu Vellai Mazhai\n" +
                "Sujatha, Unni Menon\n"+"Puthu Vellai Mazhai Ingu Pozhiginrathu\n" +
                "Intha Kollai Nilaa Udal Anaiginrathu\n" +
                "Ingu Sollaatha Idam Kooda Kulirginrathu\n" +
                "Manam Soodaana Itham Thaedi Alaiginrathu\n" +
                "\n" +
                "Puthu Vellai Mazhai Ingu Pozhiginrathu\n" +
                "Intha Kollai Nilaa Udal Anaiginrathu\n" +
                "Ingu Sollaatha Idam Kooda Kulirginrathu\n" +
                "Manam Soodaana Itham Thaedi Alaiginrathu\n" +
                "\n" +
                "Nathiyae Neeyaanaal Karai Naane\n" +
                "Siru Paravai Neeyaanaal Un Vaanam Naane\n" +
                "Puthu Vellai Mazhai Ingu Pozhiginrathu\n" +
                "Intha Kollai Nilaa Udal Anaiginrathu\n" +
                "\n" +
                "Pen Illaatha Oorilae Adi Aan Poo Kaetpathillai\n" +
                "Pen Illaatha Oorilae Kodithaan Poo Pooppathillai\n" +
                "Un Pudavai Munthaanai Saainthathil Intha Bhoomi Poo Poothathu\n" +
                "Ithu Kamban Paadaatha Sinthanai Unthan Kaathodu Yaar Sonnathu\n" +
                "\n" +
                "Puthu Vellai Mazhai Ingu Pozhiginrathu\n" +
                "Intha Kollai Nilaa Udal Anaiginrathu\n" +
                "Ingu Sollaatha Idam Køøda Kulirginrathu\n" +
                "Manam Šøødaana Itham Thaedi Alaiginrathu\n" +
                "Puthu Vellai Mazhai Ingu Pøzhiginrathu\n" +
                "Intha Køllai Nilaa Udal Anaiginrathu\n" +
                "\n" +
                "Nee Annaikkinra Vaelaiyil Uyir Pøø Vedukkendru Malarum\n" +
                "Nee Vedukindru Oadinaal Uyir Pøø Šarugaaga Ularum\n" +
                "Iru Kaigal Theendaatha Penmaiyai Un Kangal Panthaaduthø\n" +
                "Malar Manjam Šaeratha Pennilaa Èn Maarbødu Vanthaaduthø\n" +
                "\n" +
                "Puthu Vellai Mazhai Ingu Pøzhiginrathu\n" +
                "Intha Køllai Nilaa Udal Nanaiginrathu\n" +
                "Ingu Šøllaatha Idam Køøda Kulirginrathu\n" +
                "Manam Šøødaana Itham Thaedi Alaiginrathu\n" +
                "\n" +
                "Nathiyae Neeyaanaal Karai Naane\n" +
                "Širu Paravai Neeyaanaal Un Vaanam Naane\n" +
                "\n" +
                "Puthu Vellai Mazhai Ingu Pøzhiginrathu\n" +
                "Intha Køllai Nilaa Udal Anaiginrathu\n" +
                "Puthu Vellai Mazhai Ingu Pøzhiginrathu\n" +
                "Intha Køllai Nilaa Udal Anaiginrathu";
        lyric.setText(s);
        lyric.setMovementMethod(new ScrollingMovementMethod());
        playBtn = findViewById(R.id.playbtn);
        elapse = findViewById(R.id.elapse);
        remain = findViewById(R.id.remain);

        mp = MediaPlayer.create(this, R.raw.pudhu);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        totalTime = mp.getDuration();

        positionBar = findViewById(R.id.seekBar);
        positionBar.setMax(totalTime);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mp.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
/*
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
*/
    }




   /* public String createTimeLabel(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }*/

    public void playBtnClick(View view) {

        if (!mp.isPlaying()) {
            // Stopping
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        } else {
            // Playing
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }

    }
}




