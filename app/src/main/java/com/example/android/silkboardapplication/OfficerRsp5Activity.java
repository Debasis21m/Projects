package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class OfficerRsp5Activity extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),OfficerRsp6Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_rsp5);
        Spinner dropdown13 = findViewById(R.id.spinner13);
        String[] items13 = new String[]{"Up-to-date", "Not up-to-date", "Not maintained"};
        ArrayAdapter<String> adapter13 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items13);
        dropdown13.setAdapter(adapter13);
        Spinner dropdown14 = findViewById(R.id.spinner14);
        String[] items14 = new String[]{"Up-to-date", "Not up-to-date", "Not maintained"};
        ArrayAdapter<String> adapter14 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items14);
        dropdown14.setAdapter(adapter14);
        Spinner dropdown15 = findViewById(R.id.spinner15);
        String[] items15 = new String[]{"Up-to-date", "Not up-to-date", "Not maintained"};
        ArrayAdapter<String> adapter15 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items15);
        dropdown15.setAdapter(adapter15);
        Spinner dropdown16 = findViewById(R.id.spinner16);
        String[] items16 = new String[]{"Up-to-date", "Not up-to-date", "Not maintained"};
        ArrayAdapter<String> adapter16 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items16);
        dropdown16.setAdapter(adapter16);
    }
}
