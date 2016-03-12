package com.example.rieck.supergame.world;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;

/**
 * Created by rieck on 11.03.2016.
 */
public class Sprite {

    public Bitmap bitmap;
    private Canvas canvas;
    public int x, y = 0;
    private int xMove, yMove = 0;
    private int width, height;
    private Direction direction = Direction.RIGHT;
    private SpriteStep spriteStep = SpriteStep.ZERO;

    Sprite(Bitmap bitmap) {
        this.bitmap = bitmap;

        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
    }

    public void draw(Canvas canvas) {
        Log.w("DRAW", "x|y=" + String.valueOf(x) + " | " + String.valueOf(y));

        int srcX = width / 3 * spriteStep.value;
        int srcY = height / 4 * direction.value;
        Rect src = new Rect(srcX, srcY ,srcX + width / 3, srcY + height / 4);
        Rect dest = new Rect(x, y, x + width / 3, y + height / 4);
        this.canvas = canvas;
        canvas.drawColor(Color.WHITE);
        canvas.drawBitmap(this.bitmap, src, dest, new Paint());
    }

    public void move(Direction newDirection, int xMove, int yMove) {
        move(newDirection, xMove, yMove, 1);
    }

    public void move(Direction newDirection, int xMove, int yMove, int speed) {
        this.direction = newDirection;
        this.x += xMove * speed;
        this.y += yMove * speed;
        //draw(this.canvas);
    }

}
