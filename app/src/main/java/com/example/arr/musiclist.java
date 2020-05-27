package com.example.arr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class musiclist extends AppCompatActivity {

    ImageButton imb1,imb2,imb3,imb4,imb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclist);

        imb1=findViewById(R.id.imb1);
        imb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),pudhu.class);
                startActivity(i);

            }
        });

        imb2=findViewById(R.id.imb2);
        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),dilse.class);
                startActivity(i);

            }
        });

        imb3=findViewById(R.id.imb3);
        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),uyire.class);
                startActivity(i);

            }
        });

        imb4=findViewById(R.id.imb4);
        imb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),neeye.class);
                startActivity(i);

            }
        });

        imb5=findViewById(R.id.imb5);
        imb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ishq.class);
                startActivity(i);

            }
        });

    }
}
