package com.knowlexon.mycatercan.mywatercan.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.knowlexon.mycatercan.mywatercan.R;

public class SplashScreenActivity extends AppCompatActivity {//Ready

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView rd = (ImageView) findViewById(R.id.round_drop);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_clockwise);
        rd.startAnimation(hyperspaceJumpAnimation);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                finish();
            }
        },2000);

    }



}
