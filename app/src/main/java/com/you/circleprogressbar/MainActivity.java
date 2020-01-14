package com.you.circleprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView pbImg = findViewById(R.id.pb_img);
        ((AnimatedVectorDrawable) pbImg.getDrawable()).start();
    }
}
