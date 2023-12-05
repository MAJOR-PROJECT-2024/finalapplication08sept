package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;





public class mainactivity2bmi extends AppCompatActivity {
    TextView mcurrentheight;
    TextView mcurrentweight, mcurrentage;
    ImageView mincrementage, mdecrementage, mincrementweight, mdecrementweight;
    SeekBar mseekbarforheight;
    Button mcalculatebmi;

    int intweight = 55;
    int intage = 22;
    int currentprogress;

    String mintprogress = "170";
    String typerofuser = "0";
    String weight2 = "55";
    String age2 = "22";

    @SuppressLint("ResourceAsColor")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2bmi);
        mcurrentage = findViewById(R.id.currentage);
        mcurrentweight = findViewById(R.id.currentweight);
        mcurrentheight = findViewById(R.id.currentheight);
        mincrementage = findViewById(R.id.incrementage);
        mdecrementage = findViewById(R.id.decrementage);
        mincrementweight = findViewById(R.id.incrementweight);
        mdecrementweight = findViewById(R.id.decrementweight);
        mcalculatebmi = findViewById(R.id.calculator); // Changed "calclator" to "calculator"
        mseekbarforheight = findViewById(R.id.seekbarforheight);

        mseekbarforheight.setMax(300);
        mseekbarforheight.setProgress(170);

        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress = progress;
                mintprogress = String.valueOf(currentprogress);
                mcurrentheight.setText(mintprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight = intweight + 1;
                weight2 = String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage = intage + 1;
                age2 = String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });

        mdecrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage = intage - 1;
                age2 = String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });

        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight = intweight - 1;
                weight2 = String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

        mcalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {if(mintprogress.equals("0")) {
                Toast.makeText(getApplicationContext(), "Select your Height First", Toast.LENGTH_SHORT).show();
            } else if(intage == 0 || intage < 0) {
                Toast.makeText(getApplicationContext(), "Age is incorrect", Toast.LENGTH_SHORT).show();
            } else if(intweight == 0 || intweight < 4) {
                Toast.makeText(getApplicationContext(), "Weight is incorrect", Toast.LENGTH_SHORT).show();
            } else {
                // Calculate BMI and start the next activity
                Intent intent = new Intent(mainactivity2bmi.this, bmiactivity.class);
                intent.putExtra("gender", typerofuser);
                intent.putExtra("height", mintprogress);
                intent.putExtra("weight", weight2);
                intent.putExtra("age", age2);
                startActivity(intent);

            }
            }
        });
    }
}
