package com.example.secondstage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void back(View view){
    /* kudato nazad... */
        Intent i = new Intent(this, SignInActivity.class);
        startActivity(i);
    }
}