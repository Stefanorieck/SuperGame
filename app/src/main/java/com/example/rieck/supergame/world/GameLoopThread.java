package com.example.rieck.supergame.world;

import android.graphics.Canvas;
import android.util.Log;

/**
 * Created by rieck on 12.03.2016.
 */
public class GameLoopThread extends Thread{
    private WorldView view;
    private boolean running = false;

    public GameLoopThread(WorldView view) {
        this.view = view;
    }

    public void setRunning(boolean run) {
        running = run;
    }

    @Override
    public void run() {
        while (running) {

            Canvas c = null;
            try {
                c = view.getHolder().lockCanvas();
                synchronized (view.getHolder()) {

                    view.draw(c);
                }
            } finally {
                if (c != null) {
                    view.getHolder().unlockCanvasAndPost(c);
                }
            }
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
