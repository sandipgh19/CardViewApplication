package com.example.sandipghosh.cardviewapplication;

import android.graphics.Bitmap;

/**
 * Created by sandipghosh on 21/03/17.
 */

public class Card {

    private String txt1;
    private String txt2;
    private Bitmap image;

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
