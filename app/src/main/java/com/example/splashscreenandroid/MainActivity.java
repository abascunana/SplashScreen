package com.example.splashscreenandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.FlingAnimation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView[] mImageViews;
TextView[] mTextViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView12);
        mImageViews = new ImageView[]{imageView1,imageView2,imageView3,imageView4};
        Animation  animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        Animation  animation2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.clockwise);
        for (int i = 0; i < mImageViews.length; i++) {
            mImageViews[i].setAnimation(animation);
        }
        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        mTextViews = new TextView[]{textView1,textView2};
        for (int i = 0; i < mTextViews.length; i++) {
            mTextViews[i].setAnimation(animation2);
        }

    }
}