package com.example.dragneel.bookhub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent in = getIntent();
    }

    public void termsfunc(View view) {
        // Do something in response to button
        Intent in = new Intent(this,terms.class);
        startActivity(in);
    }

}

