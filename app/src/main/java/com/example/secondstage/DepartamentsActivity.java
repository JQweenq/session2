package com.example.secondstage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DepartamentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departaments);
    }

    public void back(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}