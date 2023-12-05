package com.example.newapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bmiactivity extends AppCompatActivity{

    TextView mbmidisplay,magedisplay,mheightdisplay,mbmicategory;
    Button mgotomain;
    Intent intent;

    ImageView mimageview;
    String mbmi;
    float intbmi;

    String height;
    String weight;

    float intheight,intweight;
    RelativeLayout mbackground;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        ColorDrawable colorDrwable= new ColorDrawable(Color.parseColor("#1E1D1D"));
        intent = getIntent();
        mbmidisplay = findViewById(R.id.bmidisplay);
        mbmicategory=findViewById(R.id.bmicategorydisplay);
        mgotomain=findViewById(R.id.gotomain);
        mimageview=findViewById(R.id.imageview);
        mbackground=findViewById(R.id.contentlayout);

        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");

        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);


        intheight = intheight/100;
        intbmi=intweight/(intheight*intheight);

        mbmi = Float.toString(intbmi);
        System.out.println(mbmi);

        if (intbmi<18.5){
            mbmicategory.setText("Underweight");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.bmi_classify);
        }




        else if(intbmi<24.9 && intbmi > 18.5){
            mbmicategory.setText("Normal");
            mbackground.setBackgroundColor(Color.GREEN);
            mimageview.setImageResource(R.drawable.bmi_classify);

        }

        else if(intbmi < 29.9 && intbmi > 25){
            mbmicategory.setText("Overweight");
            mbackground.setBackgroundColor(Color.RED);

            mimageview.setImageResource(R.drawable.bmi_classify);
        }

        else if(intbmi < 34.9 && intbmi > 30){
            mbmicategory.setText("Obese");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.bmi_classify);
        }
        else{
            mbmicategory.setText("Extremely Obese");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.bmi_classify);

        }
        mbmidisplay.setText(mbmi);

        mgotomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), mainactivity2bmi.class);
                startActivity(intent1);
                finish();

            }
        });

    }






}
