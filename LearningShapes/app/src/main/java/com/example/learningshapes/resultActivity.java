package com.example.learningshapes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultLabel = (TextView) findViewById(R.id.resultLabel);
       // TextView totalScoreLabel = (TextView) findViewById(R.id.totalScoreLabel);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        SharedPreferences settings = getSharedPreferences("quizzler", Context.MODE_PRIVATE);
        int totalScore = settings.getInt("totalScore", 0);
        totalScore +=score;

        resultLabel.setText(score +" / 5");
       // totalScoreLabel.setText("Total Score: "+totalScore);

        //Update total score
       // SharedPreferences.Editor editor = settings.edit();
      //  editor.putInt("totalScore", totalScore);
      //  editor.commit();
    }
    public  void returnTop(View v){
        Intent activity2Intent = new Intent(resultActivity.this,front.class);
        finish();
        startActivity(activity2Intent);

    }
}
