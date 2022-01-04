package com.example.fundforchange.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fundforchange.R;

public class MainActivity extends AppCompatActivity {

    private static int SPALSH_SCREEN = 3000;



    //variables
    Animation topAnime, bottomAnime;
    ImageView image;
    TextView logo, slogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        topAnime = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnime = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //hookes

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        //slogan = findViewById(R.id.text)
        image.setAnimation(topAnime);
        logo.setAnimation(bottomAnime);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
                finish();
            }
        },SPALSH_SCREEN);
    }
}