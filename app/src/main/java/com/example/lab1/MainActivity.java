package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtMain;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtMain = findViewById(R.id.txtMain);
    }

    public void btnClick1(View view) {
        this.txtMain.setText("Tekstas pakeistas");
    }


    public void btnClick2(View view) {
        this.txtMain.setTextColor(Color.RED);
    }
}