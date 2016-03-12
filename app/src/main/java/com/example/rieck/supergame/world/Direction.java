package com.example.rieck.supergame.world;

import android.webkit.DownloadListener;

/**
 * Created by rieck on 11.03.2016.
 */
public enum Direction {
    DOWN(0),
    LEFT(1),
    RIGHT(2),
    UP(3);

    int value;

    Direction(int value) {
        this.value = value;
    }

}
