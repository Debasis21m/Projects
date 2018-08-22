package com.example.android.silkboardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceBwRcrAndRspSo extends AppCompatActivity {

    public void clickRCR(View v)
    {
        Intent intent = new Intent(this,OfficerRcr2Activity.class);
        startActivity(intent);
    }


    public void clickRSP(View v)
    {
        Intent intent = new Intent(this,OfficerRsp1Activity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_bw_rcr_and_rsp_sa);
    }
}
