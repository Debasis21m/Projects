package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnalystPage3 extends AppCompatActivity {

    public void proceedButton(View v) {
        Intent intent = new Intent(this,AnalystPage4Activity.class);
        startActivity(intent); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyst_page3);
    }
}
