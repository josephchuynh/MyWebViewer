package com.example.jchuynh99.mywebviewer3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonUcsd, buttonYahoo;

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonUcsd:
                Intent u;
                u = new Intent(this, UcsdActivity.class);
                startActivity(u);
                break;
            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this, YahooActivity.class);
                startActivity(y);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* new code */

        buttonUcsd = (Button) findViewById(R.id.buttonUcsd);
        buttonUcsd.setOnClickListener(this);

        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);
    }


}
