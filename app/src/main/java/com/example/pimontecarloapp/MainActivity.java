package com.example.pimontecarloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class MainActivity extends AppCompatActivity {

    private BerechnePi pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void btnBerechne_onClick(View view) {

        EditText number = findViewById(R.id.editText);
        int value =  Integer.parseInt(number.getText().toString());

        pi = new BerechnePi(value);

        TextView text_pi = findViewById(R.id.textView);
        text_pi.setText("Pi ist: " + (double) pi.berechne_Pi() );

    }


}


