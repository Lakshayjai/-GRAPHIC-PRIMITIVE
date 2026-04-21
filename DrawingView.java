package com.example.portfolioapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawingView extends View {

    Paint paint;

    public DrawingView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw Line
        canvas.drawLine(50, 50, 300, 50, paint);

        // Draw Rectangle
        canvas.drawRect(50, 100, 300, 250, paint);

        // Draw Circle
        canvas.drawCircle(175, 400, 100, paint);

        // Draw Text
        paint.setTextSize(40);
        canvas.drawText("Graphics Demo", 50, 600, paint);
    }
}

