package com.eden.androidcamera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
    Bitmap bitmap;
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
        bitmap = Bitmap.createBitmap(1920, 1080, Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bitmap);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(15);
    }

    @Override
    public void onDraw(Canvas canvas) {

        canvas.drawLine(0, 0, 50, 50, paint);
        canvas.drawLine(50, 0, 0, 50, paint);
    }

}