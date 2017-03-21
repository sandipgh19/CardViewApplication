package com.example.sandipghosh.cardviewapplication;

import android.graphics.Bitmap;

/**
 * Created by sandipghosh on 21/03/17.
 */

public class Card {

    String text1;
    String text2;
    Bitmap bitmap;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}