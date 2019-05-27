package com.example.krwiodawcy;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BloodLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_log);

        FloatingActionButton floatingActionButtonAddDonation = findViewById(R.id.floatingActionButton8);
        floatingActionButtonAddDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BloodLogActivity.this, BloodDonation.class);
                startActivity(intent);
            }
        });
    }
}
