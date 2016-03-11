package com.example.rieck.supergame.world;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceView;

/**
 * Created by rieck on 11.03.2016.
 */
public class WorldView extends SurfaceView {

    Paint paint = new Paint();

    public WorldView(Context context)  {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Character hero = new Character(getResources(), canvas);
        hero.draw();
        hero.moveDown();
        hero.moveDown();
        hero.moveUp();

        /*paint.setColor(Color.CYAN);
        for (int y=1; y <= 10; y++) {
            if (y % 2 == 0)
                paint.setColor(Color.BLUE);
            else
                paint.setColor(Color.YELLOW);
            for (int x=1; x <= 10; x++) {
                canvas.drawRect(10*x, 10*y, 10*x + 10, 10*y + 10, paint);
            }
        }

        canvas.drawRect(150, 150, 151, 151, paint);*/


    }
}
