package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void switchLayout(View view) {
        setContentView(R.layout.activity_edit_texts);
    }

    public void switchLayout2(View view) {
        setContentView(R.layout.activity_calendar_view);
    }
}