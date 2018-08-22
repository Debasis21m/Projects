package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseBwSAorSOActivity extends AppCompatActivity {

    public void seedAnalystButton(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); }

    public void seedOfficerButton(View v)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bw_saor_so);
    }
}
