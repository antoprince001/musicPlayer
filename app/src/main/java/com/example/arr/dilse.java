package com.example.arr;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class dilse extends AppCompatActivity {

    Button playBtn;
    SeekBar positionBar;
    TextView elapse, remain;

    TextView lyric;
    MediaPlayer mp;
    int totalTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilse);

           lyric=findViewById(R.id.lyric1);
           String s="Dil Se Re(translation: From the Heart) is a song from the movie Dil Se composed by A. R. Rahman, lyrics penned by Gulzar and sung by A. R. Rahman, Anuradha Sriram and Anupama in chorus. It was a chart topper of the year 1998 and the lyrics is said to be one of the finest and predominantly in Urdu. Its picturisation too got noticed. The song has now achieved a cult status./n/nBandhan Hai Rishton Mein\n" +
                   "Kaaton Ki Taarein Hain\n" +
                   "Patthar Ke Darwaaze Deewaarein\n" +
                   "Belein Phir Bhi Ugti Hain\n" +
                   "Aur Guchchhe Bhi Khilte Hain\n" +
                   "Aur Chalte Hain Afsaane\n" +
                   "Kirdaar Bhi Milte Hain\n" +
                   "Vo Rishtey Dil Dil Dil Thay\n" +
                   "Vo Dil Thay Dil Dil Dil Thay\n" +
                   "Gam Dil Ke Pak Chulbule Hain\n" +
                   "Paani Ke Ye Bulbule Hain\n" +
                   "Bujhte Hain Bate Rehte Hain\n" +
                   "Gam Dil Ke Pak Chulbule Hain\n" +
                   "Paani Ke Ye Bulbule Hain\n" +
                   "Bujhte Hain Bate Rehte Hain\n" +
                   "Dil Se Dil Se Dil Se Dil Se\n" +
                   "Dil Se Re\n" +
                   "Dil Se Re Dil Se Re\n" +
                   "Dil Se Re Dil Se Re\n" +
                   "Dil To Aakhir Dil Hai Na\n" +
                   "Meethi Si Mushkil Hai Na\n" +
                   "Piya Piya\n" +
                   "Dil To Aakhir Dil Hai Na\n" +
                   "Meethi Si Mushkil Hai Na\n" +
                   "Piya Piya Piya Na Piya\n" +
                   "Piya Piya\n" +
                   "Jiya Jiya Jiya Na Jiya\n" +
                   "Piya Piya Piya Na Piya\n" +
                   "Dil Se Re\n" +
                   "Jiya Jiya Jiya Na Jiya\n" +
                   "Dil Se Re\n" +
                   "Dil Se Re Dil Se Re\n" +
                   "Dil Se Re. ";
           lyric.setText(s);
           lyric.setMovementMethod(new ScrollingMovementMethod());
            playBtn = findViewById(R.id.playbtn);
            elapse = findViewById(R.id.elapse);
            remain = findViewById(R.id.remain);

            mp = MediaPlayer.create(this, R.raw.dil);
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

