package com.example.arr;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class ishq extends AppCompatActivity {
    Button playBtn;
    SeekBar positionBar;
    TextView elapse, remain;
    MediaPlayer mp;
    int totalTime;
    TextView lyric;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ishq);

            lyric=findViewById(R.id.lyric2);
            String s="Ishq Bina\n" +
                    "Sonu Nigam, A. R. Rahman, ...\n" +
                    "Ishq bina kya marna yaara\n" +
                    "Ishq bina kya jeena\n" +
                    "Ishq bina kya marna yaara\n" +
                    "Ishq bina kya jeena\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Vaada ya pakka ishq ishq\n" +
                    "Dhaaga ye kachcha ishq ishq\n" +
                    "O...\n" +
                    "Ishq bina kya marna yaara\n" +
                    "Ishq bina kya jeena\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Vaada ya pakka ishq ishq\n" +
                    "Dhaaga ye kachcha ishq ishq\n" +
                    "Ishq bina kya marna yaaron\n" +
                    "Ishq bina kya jeena\n" +
                    "Ishq bina kya marna yaaron\n" +
                    "Ishq bina kya jeena\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Vaada ya pakka ishq ishq\n" +
                    "Dhaaga ye kachcha ishq ishq\n" +
                    "Ishq bina kya marna yaara\n" +
                    "Ishq bina kya jeena\n" +
                    "Neeche ishq hai oopar rab hai\n" +
                    "In donon ke beech mein ke sab hai\n" +
                    "Neeche ishq hai oopar rab hai\n" +
                    "In donon ke beech mein ke sab hai\n" +
                    "Ek nahin sau baatein karlo\n" +
                    "Sau baaton ka ek matlab hai\n" +
                    "Rab sab se sona ishq ishq\n" +
                    "Rabse bhi sona ishq ishq\n" +
                    "Rab sab se sona ishq ishq\n" +
                    "Rabse bhi sona ishq ishq\n" +
                    "O...\n" +
                    "Ishq bina kya marna yaaron\n" +
                    "Ishq bina kya jeena\n" +
                    "Ishq bina kya marna yaaron\n" +
                    "Ishq bina kya jeena\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Heera na panna ishq ishq\n" +
                    "Bas ek tamanna ishq ishq\n" +
                    "Heera na panna ishq ishq\n" +
                    "Bas ek tamanna ishq ishq Ishq\n" +
                    "Bas ek tamanna ishq ishq Bina\n" +
                    "Bas ek tamanna ishq ishq Kya\n" +
                    "Bas ek tamanna ishq ishq Jeena\n" +
                    "Bas ek tamanna ishq ishq Yaara\n" +
                    "Bas ek tamanna\n" +
                    "Ishq hai kya ye kisko pata\n" +
                    "Ye ishq hai kya sabko pata\n" +
                    "Ye prem nagar anjaan dagar\n" +
                    "Saajan ka ghar ka kisko khabar\n" +
                    "Chhoti si umar ye lamba safar\n" +
                    "Ye ishq hai kya ye kisko pata\n" +
                    "Ye dard hai ya dardon ki dava\n" +
                    "Ye koi sanam ya aap khuda\n" +
                    "Ye koi sanam ya aap khuda\n" +
                    "aap khuda\n" +
                    "Ishq bina kya marna yaara\n" +
                    "Ishq bina kya jeena\n" +
                    "Tumne ishq ka naam suna hai\n" +
                    "Humne ishq kiya hai\n" +
                    "Phoolon ka gulshan ishq ishq\n" +
                    "Kaaton ka daaman ishq ishq\n" +
                    "Phoolon ka gulshan ishq ishq\n" +
                    "Kaaton ka daaman ishq ishq\n" +
                    "O...\n" +
                    "Ishq bina kya marna yaaron\n" +
                    "Ishq bina kya jeena\n" +
                    "Ishq bina kya marna yaaron\n" +
                    "Ishq bina kya jeena\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Gud se meetha ishq ishq\n" +
                    "Imli se khatta ishq ishq\n" +
                    "Ishq Ishq\n" +
                    "Ishq Ishq\n" +
                    "Ishq Ishq\n" +
                    "O...";
            lyric.setText(s);
            lyric.setMovementMethod(new ScrollingMovementMethod());

            playBtn = findViewById(R.id.playbtn);
            elapse = findViewById(R.id.elapse);
            remain = findViewById(R.id.remain);

            mp = MediaPlayer.create(this, R.raw.ishq);
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




