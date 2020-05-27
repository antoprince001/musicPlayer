package com.example.arr;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class neeye extends AppCompatActivity {

    TextView lyric;
    Button playBtn;
    SeekBar positionBar;
    TextView elapse, remain;
    MediaPlayer mp;
    int totalTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neeye);
        lyric=findViewById(R.id.lyric3);
        String s="\n" +
                "\n" +
                "Singer : Unnikrishnan\n" +
                "\n" +
                "Music by : A.R. Rahman\n" +
                "\n" +
                "Male : {Uyirum neeyae udalum neeyae\n" +
                "Uravum neeyae thaayae}(2)\n" +
                "{Thaan udalil sumanthu uyirai pagirnthu\n" +
                "Uruvam tharuvaai neeyae} (2)\n" +
                "\n" +
                "Male : {Un kannil vazhiyum oru thuli pothum\n" +
                "Kadalum urugum thaayae} (2)\n" +
                "Un kaaladi mattum tharuvai thaayae\n" +
                "Sorgam enbathu poiyae….\n" +
                "\n" +
                "Male : Uyirum neeyae udalum neeyae\n" +
                "Uravum neeyae thaayae\n" +
                "\n" +
                "Male : {Vinnai padaithaan mannai padaithaan\n" +
                "Katrum mazhaiyum oliyum padaithaan} (2)\n" +
                "\n" +
                "Male : Boomikku athanaal nimmathi illai\n" +
                "Boomikku athanaal nimmathi illai\n" +
                "Sami thavithaan…sami thavithaan\n" +
                "Thaayai padaithan…\n" +
                "\n" +
                "Male : {Uyirum neeyae udalum neeyae\n" +
                "Uravum neeyae thaayae}(2)\n" +
                "{Thaan udalil sumanthu uyirai pagirnthu\n" +
                "Uruvam tharuvaai neeyae} (2)\n" +
                "\n" +
                "Male : {Un kannil vazhiyum oru thuli pothum\n" +
                "Kadalum urugum thaayae} (2)\n" +
                "Un kaaladi mattum tharuvai thaayae\n" +
                "Sorgam enbathu poiyae….\n" +
                "\n" +
                "Male : Uyirum neeyae udalum neeyae\n" +
                "Uravum neeyae thaayae\n";
        lyric.setText(s);
        lyric.setMovementMethod(new ScrollingMovementMethod());
            playBtn = findViewById(R.id.playbtn);
            elapse = findViewById(R.id.elapse);
            remain = findViewById(R.id.remain);

            mp = MediaPlayer.create(this, R.raw.uyirum);
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


