package com.example.learningshapes;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity1 extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        lottieAnimationView= (LottieAnimationView) findViewById(R.id.LottieAnimationView);
        startCheckAnimation();



            }

    private void startCheckAnimation(){
        ValueAnimator animator=ValueAnimator.ofFloat(0f,1f).setDuration(1500);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                lottieAnimationView.setProgress((Float)animation.getAnimatedValue());
            }
        });
        if(lottieAnimationView.getProgress()==0f){
            animator.setStartDelay(1000);
            animator.start();
        }else {
            lottieAnimationView.setProgress(0f);
        }
    }

    public  void onButtonClick(View v){
        Intent activity2Intent = new Intent(MainActivity1.this,front.class);
        finish();
        startActivity(activity2Intent);

    }

}

