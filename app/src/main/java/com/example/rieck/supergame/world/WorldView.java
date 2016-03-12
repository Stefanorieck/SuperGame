package com.example.rieck.supergame.world;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by rieck on 11.03.2016.
 */
public class WorldView extends SurfaceView {

    Paint paint = new Paint();
    int x = 0;
    int xSpeed= 0;
    Character hero;

    public WorldView(Context context)  {
        super(context);
        hero = new Character(getResources());
        final GameLoopThread thread = new GameLoopThread(this);
        SurfaceHolder holder = getHolder();
        holder.addCallback(new SurfaceHolder.Callback(){

            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                thread.setRunning(true);
                thread.start();
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                boolean retry = true;
                thread.setRunning(false);
                while (retry) {
                    try {
                        thread.join();
                        retry = false;
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        hero.moveDown();
        hero.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TOUCH", "TOUCH");
        //hero.moveDown();

        /*if (event.getY() > hero.getYPos()) {
            hero.moveDown();
            //hero.draw();
        }
        else hero.moveUp();*/
        return true;
    }
}
