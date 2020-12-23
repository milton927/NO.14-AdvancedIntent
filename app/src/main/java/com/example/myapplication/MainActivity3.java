package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        open_map();
    }
    private void open_map(){
        Intent map = new Intent(Intent.ACTION_VIEW);
        startActivity(map);
        finish();//開啟後關閉XML
    }
}