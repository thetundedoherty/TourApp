package com.example.user.tourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by USER on 6/2/2017.
 */

public class SouthWestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SouthWestFragment())
                .commit();
    }



}
