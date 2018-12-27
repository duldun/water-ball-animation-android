package com.encyteus.waterball;

import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView water_ball,water_ball_2,water_ball_3,water_ball_4,water_ball_5,water_ball_6,water_ball_7,water_ball_8,Water_ball_9,Water_ball_10;
    ConstraintLayout view;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomWaterBallAnimation();

//        view = findViewById(R.id.view);
//        view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                positionX = motionEvent.getX();
//                positionY = motionEvent.getY();
//                return false;
//            }
//        });

    }


    private void randomWaterBallAnimation(){
        water_ball =  findViewById(R.id.water_ball);
        TranslateAnimation mAnimation ;
        mAnimation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.3f);
        mAnimation.setDuration(25000);
        mAnimation.setRepeatCount(-1);
        mAnimation.setRepeatMode(Animation.REVERSE);
        mAnimation.setInterpolator(new LinearInterpolator());
        water_ball.setAnimation(mAnimation);

        water_ball_2 =  findViewById(R.id.water_ball_2);
        TranslateAnimation mAnimation2 ;
        mAnimation2 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.7f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.2f);
        mAnimation2.setDuration(30000);
        mAnimation2.setRepeatCount(-1);
        mAnimation2.setRepeatMode(Animation.REVERSE);
        mAnimation2.setInterpolator(new LinearInterpolator());
        water_ball_2.setAnimation(mAnimation2);

        water_ball_3 = findViewById(R.id.water_ball_3);
        TranslateAnimation mAnimation3 ;
        mAnimation3 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT,1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.8f);
        mAnimation3.setDuration(25000);
        mAnimation3.setRepeatCount(-1);
        mAnimation3.setRepeatMode(Animation.REVERSE);
        mAnimation3.setInterpolator(new LinearInterpolator());
        water_ball_3.setAnimation(mAnimation3);

        water_ball_4 = findViewById(R.id.water_ball_4);
        TranslateAnimation mAnimation4 ;
        mAnimation4 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.1f);
        mAnimation4.setDuration(45000);
        mAnimation4.setRepeatCount(-1);
        mAnimation4.setRepeatMode(Animation.REVERSE);
        mAnimation4.setInterpolator(new LinearInterpolator());
        water_ball_4.setAnimation(mAnimation4);

        water_ball_5 = findViewById(R.id.water_ball_5);
        TranslateAnimation mAnimation5 ;
        mAnimation5 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.3f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.9f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.2f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1f);
        mAnimation5.setDuration(20000);
        mAnimation5.setRepeatCount(-1);
        mAnimation5.setRepeatMode(Animation.REVERSE);
        mAnimation5.setInterpolator(new LinearInterpolator());
        water_ball_5.setAnimation(mAnimation5);

        water_ball_6 = findViewById(R.id.water_ball_6);
        TranslateAnimation mAnimation6 ;
        mAnimation6 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.1f);
        mAnimation6.setDuration(35000);
        mAnimation6.setRepeatCount(-1);
        mAnimation6.setRepeatMode(Animation.REVERSE);
        mAnimation6.setInterpolator(new LinearInterpolator());
        water_ball_6.setAnimation(mAnimation6);

        water_ball_7 = findViewById(R.id.water_ball_7);
        TranslateAnimation mAnimation7 ;
        mAnimation7 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.8f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.2f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.6f);
        mAnimation7.setDuration(28000);
        mAnimation7.setRepeatCount(-1);
        mAnimation7.setRepeatMode(Animation.REVERSE);
        mAnimation7.setInterpolator(new LinearInterpolator());
        water_ball_7.setAnimation(mAnimation7);

        water_ball_8 = findViewById(R.id.water_ball_8);
        TranslateAnimation mAnimation8 ;
        mAnimation8 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT,-0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.4f);
        mAnimation8.setDuration(21000);
        mAnimation8.setRepeatCount(-1);
        mAnimation8.setRepeatMode(Animation.REVERSE);
        mAnimation8.setInterpolator(new LinearInterpolator());
        water_ball_8.setAnimation(mAnimation8);


        Water_ball_10 = findViewById(R.id.water_ball_10);
        TranslateAnimation mAnimation10 ;
        mAnimation10 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.2f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1f,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.2f);
        mAnimation10.setDuration(25000);
        mAnimation10.setRepeatCount(-1);
        mAnimation10.setRepeatMode(Animation.REVERSE);
        mAnimation10.setInterpolator(new LinearInterpolator());
        Water_ball_10.setAnimation(mAnimation10);

        Water_ball_9 = findViewById(R.id.water_ball_9);
        TranslateAnimation mAnimation9 ;
        mAnimation9 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.4f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.3f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.2f,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.1f);
        mAnimation9.setDuration(31000);
        mAnimation9.setRepeatCount(-1);
        mAnimation9.setRepeatMode(Animation.REVERSE);
        mAnimation9.setInterpolator(new LinearInterpolator());
        Water_ball_9.setAnimation(mAnimation9);
    }
}
