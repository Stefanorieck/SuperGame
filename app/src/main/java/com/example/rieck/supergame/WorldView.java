package com.example.rieck.supergame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by rieck on 11.03.2016.
 */
public class WorldView extends View {

    Paint paint = new Paint();

    public WorldView(Context context)  {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.CYAN);
        for (int y=1; y <= 10; y++) {
            if (y % 2 == 0)
                paint.setColor(Color.BLUE);
            else
                paint.setColor(Color.YELLOW);
            for (int x=1; x <= 10; x++) {
                canvas.drawRect(10*x, 10*y, 10*x + 10, 10*y + 10, paint);
            }
        }

        canvas.drawRect(150, 150, 151, 151, paint);


    }
}
