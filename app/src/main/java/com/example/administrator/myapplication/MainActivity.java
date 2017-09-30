package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.data.ParcelableClass;
import static com.example.administrator.myapplication.log.DebugLog.logd;


public class MainActivity extends AppCompatActivity {
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton =(Button)findViewById(R.id.button);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logd("onClick....");
//                SerializableClass sClass = new SerializableClass();
                ParcelableClass sClass = new ParcelableClass();
                sClass.setName(sClass.toString());
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                intent.putExtra("name",sClass);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
