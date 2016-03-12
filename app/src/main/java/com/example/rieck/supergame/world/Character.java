package com.example.rieck.supergame.world;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.rieck.supergame.R;

/**
 * Created by rieck on 11.03.2016.
 */
public class Character {

    public Sprite sprite;

    Character(Resources resources) {
        Bitmap bitmap = BitmapFactory.decodeResource(resources, R.drawable.charsprite);
        sprite = new Sprite(bitmap);
    }

    public void draw(Canvas canvas) {
        sprite.draw(canvas);
    }

    public void moveUp() {
        sprite.move(Direction.UP, 0, -1, 1);

    }

    public void moveDown() {
        sprite.move(Direction.DOWN, 0, 1, 1);

    }

}
