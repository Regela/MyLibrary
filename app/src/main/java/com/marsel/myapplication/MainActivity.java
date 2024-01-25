package com.marsel.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.marsel.library.HelloWorldUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hello = HelloWorldUtil.helloWorld();

        Toast.makeText(this, hello, Toast.LENGTH_SHORT).show();
    }
}