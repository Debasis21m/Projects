package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceBwRcrAndRspSa extends AppCompatActivity {

   public void clickRCR(View v)
    {
        Intent intent = new Intent(this,AnalystPage1.class);
        startActivity(intent);
    }


    public void clickRSP(View v)
    {
        Intent intent = new Intent(this,AnalystRsp1Activity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_bw_rcr_and_rsp_sa);
    }
}
