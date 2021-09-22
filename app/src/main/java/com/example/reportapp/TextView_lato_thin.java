package com.example.reportapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class TextView_lato_thin extends AppCompatTextView {



    public TextView_lato_thin( Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
        init();
    }

    public TextView_lato_thin( Context context,  AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextView_lato_thin( Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()){
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Medium.ttf");
            setTypeface(tf);
        }
    }


}
