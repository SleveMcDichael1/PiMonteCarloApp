package com.example.pimontecarloapp;

import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;


public class DrawShit {
    Rect rectangle;
    Paint paint;
    int x = 50;
    int y = 50;
    int sideLength = 200;

    public DrawShit(int x, int y, int sideLength){
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;

        rectangle = new Rect(x, y, sideLength, sideLength);
        paint = new Paint(Color.BLACK);

    }


    public void onDraw(Canvas canvas){
        canvas.drawRect(rectangle, paint);
    }

}
