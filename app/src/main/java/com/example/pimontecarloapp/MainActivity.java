package com.example.pimontecarloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void btnBerechne_onClick(View view) {
        //TextView tv = (TextView) findViewById(R.id.textView2);
        //tv.setText("Test");

        DrawShit test = new DrawShit(50,50,200);


    }


}


