package com.example.jchuynh99.mywebviewer3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);

        WebView yahooView = (WebView) findViewById(R.id.webViewYahoo);
        yahooView.loadUrl("https://www.yahoo.com/");

    }
}
