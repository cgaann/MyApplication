package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.administrator.myapplication.data.SerializableClass;
import com.example.administrator.myapplication.data.ParcelableClass;

public class SecondActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //SerializableClass sClass=(SerializableClass)this.getIntent().getSerializableExtra("name");
        ParcelableClass sClass=(ParcelableClass)this.getIntent().getParcelableExtra("name");


        name = sClass.getName();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action " + name, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
