package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OfficerRcr1Activity extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),OfficerRcr2Activity.class);
        startActivity(intent);
    }
    public void fun2(View v)
    {
        Intent intent = new Intent(getApplicationContext(),OfficerRsp1Activity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_rcr1);
    }
}
