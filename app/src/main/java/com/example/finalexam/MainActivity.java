package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.content.res.Resources;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button minus;
    private Button plus;
    private ImageView battery;

    int level = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minus = findViewById(R.id.minusbutton);
        plus = findViewById(R.id.plusbutton);
        battery = findViewById(R.id.batteryImg);

        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //update level number based on which button is pressed
        if(v.getId() == R.id.minusbutton){
            level--;
        }
        if(v.getId() == R.id.plusbutton){
            level++;
        }
        if(level < 1){ level = 1;}
        if(level > 7){ level = 7;}

        //update new image
        battery.setImageLevel(level);

    }


    }