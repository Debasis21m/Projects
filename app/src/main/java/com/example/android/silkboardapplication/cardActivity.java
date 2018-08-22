package com.example.android.silkboardapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.silkboardapplication.R;

import java.util.ArrayList;
import java.util.List;

public class cardActivity extends AppCompatActivity {
    private List<com.example.android.silkboardapplication.cardObject> farms;
    private RecyclerView recyclerView;
    private adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        recyclerView = (RecyclerView) findViewById(R.id.theList);
        farms = new ArrayList<>();
        mAdapter = new adapter(farms);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        list_infrlater();
    }
    void list_infrlater()
    {

        com.example.android.silkboardapplication.cardObject card=new com.example.android.silkboardapplication.cardObject(R.drawable.farm1,"Gabri's Farm","70 Cliff Avenue New London CT 06320",false,33);
        farms.add(card);
        card=new com.example.android.silkboardapplication.cardObject(R.drawable.farm2,"Subru's Farm","490 E Main Street Norwich CT 06360",true,41);
        farms.add(card);
        card=new com.example.android.silkboardapplication.cardObject(R.drawable.farm3,"Reddy's Farm","3 Cardinal Drive Groton CT 06340",false,69);
        farms.add(card);
        mAdapter.notifyDataSetChanged();
    }

}
