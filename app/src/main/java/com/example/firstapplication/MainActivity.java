package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button promjenaPozadine;
    private WallpaperManager wpmngr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        promjenaPozadine = findViewById(R.id.button);

        promjenaPozadine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                wpmngr = WallpaperManager.getInstance(MainActivity.this);
                try {
                    wpmngr.setResource(R.drawable.wallpaper);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}