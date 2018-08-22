package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class OfficerRsp4Activity extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),OfficerRsp5Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_rsp4);
        Spinner dropdown11 = findViewById(R.id.spinner11);
        String[] items11 = new String[]{"Registered CRCs", "Farmers", "Non-registered CRCs"};
        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items11);
        dropdown11.setAdapter(adapter11);
        Spinner dropdown12 = findViewById(R.id.spinner12);
        String[] items12 = new String[]{"Regularly tested", "Randomly tested", "Not practiced"};
        ArrayAdapter<String> adapter12 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items12);
        dropdown12.setAdapter(adapter12);
    }
}
