package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AnalystPage4Activity extends AppCompatActivity {

    public void finishButton(View v){
        Toast.makeText(this,"Registered RealTime",Toast.LENGTH_SHORT);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyst_page4);
    }
}
