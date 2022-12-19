package com.example.splashscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView[] mImageViews;
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView12);
        mImageViews = new ImageView[]{imageView1,imageView2,imageView3,imageView4};
     animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        for (int i = 0; i < mImageViews.length; i++) {
            mImageViews[i].setAnimation(animation);
        }
    }
}