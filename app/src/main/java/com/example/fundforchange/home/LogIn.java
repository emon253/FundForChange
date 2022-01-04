package com.example.fundforchange.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.fundforchange.R;
import com.example.fundforchange.UserMainActivity;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void signup(View view){
        Intent intent = new Intent(LogIn.this, signup.class);
        startActivity(intent);
    }

    public void login(View view){
        Intent intent = new Intent(LogIn.this , UserMainActivity.class);
        startActivity(intent);

    }
}