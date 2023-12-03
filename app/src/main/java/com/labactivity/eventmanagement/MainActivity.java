package com.labactivity.eventmanagement;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_ViewEvents, btn_AddEvents, btn_Package;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_AddEvents = findViewById(R.id.btn_events_add_id);
        btn_ViewEvents = findViewById(R.id.btn_events_view_id);
        btn_Package = findViewById(R.id.btn_events_package_id);

        btn_AddEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_AddEvents = new Intent(MainActivity.this,AddRecord.class);
                startActivity(intent_AddEvents);

            }
        });

        btn_ViewEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ViewEvents = new Intent(MainActivity.this,ViewEvents.class);
                startActivity(intent_ViewEvents);
            }
        });

        btn_Package.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Package = new Intent(MainActivity.this,EventPackage.class);
                startActivity(intent_Package);
            }
        });



    }
}