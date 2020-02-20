package com.example.pind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

public class SplashActivity extends Activity {

    //Displays the Splash before the Main Activity

    private final int Splash_Display_Length=6000;
    @Override
    public void onCreate(Bundle splash){
        super.onCreate(splash);
        setContentView(R.layout.splash_activity);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent=new Intent(SplashActivity.this, MainActivity.class);
               SplashActivity.this.startActivity(intent);
               SplashActivity.this.finish();
           }
       },Splash_Display_Length);

       //spins the image in the Splash

        Animation rotation = AnimationUtils.loadAnimation(this,R.anim.spin);
       findViewById(R.id.imageView10).startAnimation(rotation);
    }


}
