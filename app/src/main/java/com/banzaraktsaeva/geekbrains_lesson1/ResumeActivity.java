package com.banzaraktsaeva.geekbrains_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
    }

    public void intentMain(View view){
        Intent intent = new Intent(ResumeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}