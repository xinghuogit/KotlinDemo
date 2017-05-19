package com.ljm.kotlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
