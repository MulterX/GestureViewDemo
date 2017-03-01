package com.example.zhaoshuang.gestureview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v){

        TouchView touchView = new TouchView(this);
        touchView.setBackgroundResource(R.mipmap.demo1);
        touchView.setLayoutParams(new ViewGroup.LayoutParams(500, 500));
        ViewGroup vg = (ViewGroup) v.getParent();
        vg.addView(touchView);
    }
}
