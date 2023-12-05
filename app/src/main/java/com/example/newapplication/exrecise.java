package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;


public class exrecise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exrecise);
    }
    public void NormalExercise(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void PregnancyExercise(View view) {
        Intent intentt = new Intent(this, MainActivity3.class);
        startActivity(intentt);
    }
}
