package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Button2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        getSupportActionBar().hide();

    }
}
