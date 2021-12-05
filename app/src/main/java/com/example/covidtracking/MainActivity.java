package com.example.covidtracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tvCountryName,tvCases,tvRecovered;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCountryName = findViewById(R.id.tvCountryName);
        tvCases = findViewById(R.id.tvTitleCases);
        tvRecovered = findViewById(R.id.tvTitleRecovered);

        tvCountryName.setText("Asia");
        tvCases.setText("345970");
        tvRecovered.setText("165739");

    }
}