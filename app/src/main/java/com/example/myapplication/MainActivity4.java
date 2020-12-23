package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        open_web();
    }
    public void open_web(){
        WebView webView = (WebView)findViewById(R.id.web);
        webView.loadUrl("http://www.google.com");
        finish();//開啟後關閉XML
    }
}