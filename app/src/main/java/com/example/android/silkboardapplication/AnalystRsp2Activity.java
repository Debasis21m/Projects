package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AnalystRsp2Activity extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),AnalystRsp3Activity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyst_rsp2);
        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"Yes", "No", "Discontinued","Lapsed"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        Spinner dropdown2 = findViewById(R.id.spinner2);
        String[] items2 = new String[]{"Yes", "No"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);
        Spinner dropdown3 = findViewById(R.id.spinner3);
        String[] items3 = new String[]{"Sufficient", "Insufficient"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        dropdown3.setAdapter(adapter3);
        Spinner dropdown4 = findViewById(R.id.spinner4);
        String[] items4 = new String[]{"Sufficient", "Insufficient"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        dropdown4.setAdapter(adapter4);
        Spinner dropdown5 = findViewById(R.id.spinner5);
        String[] items5 = new String[]{"Sufficient", "Insufficient"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);
        dropdown5.setAdapter(adapter5);
    }
}
