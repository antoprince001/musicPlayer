package com.example.arr;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class uyire extends AppCompatActivity {
    Button playBtn;
    TextView lyric;
    SeekBar positionBar;
    TextView elapse, remain;
    MediaPlayer mp;
    int totalTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyire);


lyric=findViewById(R.id.lyric5);
String s="Uyire Uyire\n" +
        "Hariharan, Ganga\n" +
        "Uyirae Uyirae Vanthu Ennodu Kalanthuvidu\n" +
        "Uyirae Uyirae Ennai Unnoadu Kalanthuvidu\n" +
        "Ninaivae Ninaivae Enthan Nenjoadu Kalanthuvidu\n" +
        "Nilavae Nilavae Intha Vinnoadu Kalanthuvidu\n" +
        "Kaathal Irunthaal Enthan Kannoadu Kalanthuvidu\n" +
        "Kaalam Thaduthaal Ennai Mannoadu Kalanthuvidu\n" +
        "Uyirae Uyirae Vanthu Ennoadu Kalanthuvidu\n" +
        "Ninaivae Ninaivae Enthan Nenjodu Kalanthuvidu\n" +
        "En Suvaasa Kaatru Varum Paathai Paarthu\n" +
        "Uyirthaangi Naan Iruppaen\n" +
        "Malarkonda Penmai Vaaramal Ponaal\n" +
        "Malaimeethu Theekkulippaen\n" +
        "En Uyir Poagum Poanaalum Thuyarillai Kannae\n" +
        "Atharkaagavaa Paadinaen\n" +
        "Varum Ethirkaalam Un Meethu Pazhipoadum Pennae\n" +
        "Atharkaagathaan Vaadinaen\n" +
        "Muthalaa Mudivaa Athai Un Kaiyil Koduthuvittaen\n" +
        "Uyirae Uyirae Inru Unnøadu Kalanthuvittaen\n" +
        "Uravae Uravae Inru Èn Vaasal Kadanthuvittaen\n" +
        "Ninaivae Ninaivae Unthan Nenjøadu Nirainthuvittaen\n" +
        "Kanavae Kanavae Unthan Kannøadu Karainthuvittaen\n" +
        "Kaathal Irunthaal Ènthan Kannøadu Kalanthuvidu\n" +
        "Kaalam Thaduthaal Ènnai Mannøadu Kalanthuvidu\n" +
        "Uyirae Uyirae Vanthu Ènnøadu Kalanthuvidu\n" +
        "Ninaivae Ninaivae Ènthan Nenjøadu Kalanthuvidu\n" +
        "Oar Paarvai Paarthae Uyirthantha Penmai\n" +
        "Vaaraamal Pøividumaa\n" +
        "Oru Kannil Kønjam Valivantha Pøthu\n" +
        "Maru Kannum Thøøngidumaa\n" +
        "Naan Karumpaarai Palathaandi Vaeraaga Vanthaen\n" +
        "Kannaalan Mugam Paarkkavae\n" +
        "Èn Kadungaaval Palathaandi Kaatraaga Vanthaen\n" +
        "Kannaa Un Kural Kaetkavae\n" +
        "Adadaa Adadaa Indru Kanneerum Thithikkinrathey\n" +
        "Uyirae Uyirae Vanthu Ènnødu Kalanthuvidu\n" +
        "Uyirae Uyirae Ènnai Unnøadu Kalanthuvidu\n" +
        "Ninaivae Ninaivae Ènthan Nenjøadu Kalanthuvidu\n" +
        "Nilavae Nilavae Intha Vinnøadu Kalanthuvidu\n" +
        "Mazhai Pøal Mazhai Pøal Vanthu Mannødu Vizhunthu Vittaen\n" +
        "Manam Pøal Manam Pøal Unanthan Oønødu Urainthuvitaen.\n" +
        "Uyirae Uyirae Vanthu Unnødu Kalanthuvitaen\n" +
        "Ninaivae Ninaivae Unthan Nenjøadu Kalanthuvitaen.";
lyric.setText(s);
lyric.setMovementMethod(new ScrollingMovementMethod());

            playBtn = findViewById(R.id.playbtn);
            elapse = findViewById(R.id.elapse);
            remain = findViewById(R.id.remain);

            mp = MediaPlayer.create(this, R.raw.uyire);
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







