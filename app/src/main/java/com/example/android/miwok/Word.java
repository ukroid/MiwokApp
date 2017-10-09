package com.example.android.miwok;

import android.view.View;
import android.widget.TextView;

/**
 * Created by artem on 15.07.2017.
 */

public class Word  {

    private String mMiwokTranslation;
    private String mDefaultTranslation;


    public Word (String miwokTranslation, String defaultTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
