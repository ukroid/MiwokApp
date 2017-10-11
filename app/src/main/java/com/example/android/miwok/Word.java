package com.example.android.miwok;

import android.view.View;
import android.widget.TextView;

/**
 * Created by artem on 15.07.2017.
 */

public class Word  {

    private int mImage = NO_IMAGE;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private static final int NO_IMAGE = -1;


    public Word (int image, String miwokTranslation, String defaultTranslation){
        mImage = image;
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word (String miwokTranslation, String defaultTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public int getImage() {
        return mImage;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public boolean hasImage(){
        return mImage != NO_IMAGE;
    }

}
