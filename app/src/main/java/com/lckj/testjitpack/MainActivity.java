package com.lckj.testjitpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lckj.jitpack.HelloJitPack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloJitPack.hello(MainActivity.this);
    }
}