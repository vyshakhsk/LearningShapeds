package com.example.learningshapes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class front extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fromt);
    }


    public  void onButtonClickf(View v){
        Intent activity2Intent = new Intent(front.this,MainActivity.class);
        finish();
        startActivity(activity2Intent);

    }
    }
