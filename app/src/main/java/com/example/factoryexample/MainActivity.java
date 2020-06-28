package com.example.factoryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CBtn, RBtn, SBtn;
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape cShape = shapeFactory.getShape("CIRCLE");
    Shape rShape = shapeFactory.getShape("RECTANGLE");
    Shape sSHAPE = shapeFactory.getShape("SQUARE");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CBtn = findViewById(R.id.circle);
        RBtn = findViewById(R.id.rectangle);
        SBtn = findViewById(R.id.square);

        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cShape.draw(getApplicationContext());
            }
        });

        RBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rShape.draw(getApplicationContext());
            }
        });
        SBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sSHAPE.draw(getApplicationContext());
            }
        });


    }
}