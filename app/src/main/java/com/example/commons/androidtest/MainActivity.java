package com.example.commons.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.commons.string.converter.StringConverter2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name  = StringConverter2.toUpperCase("ahsan");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}