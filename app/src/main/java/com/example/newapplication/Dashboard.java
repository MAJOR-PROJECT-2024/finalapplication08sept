package com.example.newapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class Dashboard extends AppCompatActivity {

    private ImageView trackerImage, blogsImage, bmiImage, pcosImage, uploadImage, exerciseImage, videosImage, dietImage;
    private TextView trackerName, blogsName, bmiName, pcosName, uploadName, exerciseName, videosName, dietName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize your UI components
        trackerImage = findViewById(R.id.trackerImage);
        blogsImage = findViewById(R.id.blogsImage);
        bmiImage = findViewById(R.id.bmiImage);
        pcosImage = findViewById(R.id.pcosImage);
        uploadImage = findViewById(R.id.uploadImage);
        exerciseImage = findViewById(R.id.exerciseImage);
        videosImage = findViewById(R.id.videosImage);
        dietImage = findViewById(R.id.dietImage);

        trackerName = findViewById(R.id.trackerName);
        blogsName = findViewById(R.id.blogsName);
        bmiName = findViewById(R.id.bmiName);
        pcosName = findViewById(R.id.pcosName);
        uploadName = findViewById(R.id.uploadName);
        exerciseName = findViewById(R.id.exerciseName);
        videosName = findViewById(R.id.videosName);
        dietName = findViewById(R.id.dietName);

        // Set click listeners for each option
        trackerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, periodtrackeractivity.class);
                startActivity(intent);
                // Handle Tracker option click
            }
        });

        blogsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, blogssih.class);
                startActivity(intent);
                // Handle Blogs option click
            }
        });

        bmiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, splash.class);
                startActivity(intent);
                // Handle BMI Checker option click
            }
        });

        pcosImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle PCOS Detect option click
            }
        });

        uploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Upload Documents option click
            }
        });

        exerciseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, exrecise.class);
                startActivity(intent);
                // Handle Exercise option click
            }
        });

        videosImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Videos option click
            }
        });

        dietImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Diet option click
            }
        });
    }
}