package com.knowlexon.mycatercan.mywatercan.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.knowlexon.mycatercan.mywatercan.R;

public class SplashScreenActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        //Hre is my second commit
        //Hre is my third commit

    }



}
