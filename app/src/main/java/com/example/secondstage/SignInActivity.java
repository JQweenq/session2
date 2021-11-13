package com.example.secondstage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in);
    }
    public void comeAsUser(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void comeAsGuest(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}