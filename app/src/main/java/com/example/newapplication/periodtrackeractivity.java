package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class periodtrackeractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodtrackeractivity);

        final EditText cycleLengthEditText = findViewById(R.id.editTextCycleLength);
        final EditText lmpEditText = findViewById(R.id.editTextLMP);
        Button calculateButton = findViewById(R.id.btnCalculate);
        final TextView resultTextView = findViewById(R.id.textViewResult);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cycleLengthStr = cycleLengthEditText.getText().toString().trim();
                String lmpStr = lmpEditText.getText().toString().trim();

                if (!cycleLengthStr.isEmpty() && !lmpStr.isEmpty()) {
                    int cycleLength = Integer.parseInt(cycleLengthStr);

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

                    try {
                        Date lmpDate = sdf.parse(lmpStr);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(lmpDate);

                        // Calculate the next menstrual cycle date
                        calendar.add(Calendar.DAY_OF_MONTH, cycleLength);

                        Date nextCycleDate = calendar.getTime();
                        String nextCycleDateStr = sdf.format(nextCycleDate);
                        resultTextView.setText("Next Cycle Date: " + nextCycleDateStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                        resultTextView.setText("Invalid date format. Use YYYY-MM-DD.");
                    }
                } else {
                    resultTextView.setText("Please fill in all fields.");
                }
            }
        });
    }
}