package com.example.factoryexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CBtn, RBtn, SBtn;
     ShapeFactory shapeFactory = new ShapeFactory();
     Shape cShape = shapeFactory.getShape("CIRCLE");
     Shape rShape = shapeFactory.getShape("RECTANGLE");
     Shape sShape = shapeFactory.getShape("SQUARE");


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
                cShape.draw(MainActivity.this);
            }
        });

        RBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rShape.draw(MainActivity.this);
            }
        });
        SBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sShape.draw(MainActivity.this);
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        {
            builder.setMessage("Enter your message here !");
            builder.setCancelable(true);
            builder.setPositiveButton("Circle", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    cShape.draw(MainActivity.this);
                }
            });

            builder.setNegativeButton("Rectangle", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rShape.draw(MainActivity.this);
                }
            });

            builder.setNeutralButton("Square", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    sShape.draw(MainActivity.this);
                }
            });


            AlertDialog alert = builder.create();
            alert.show();
        }

    }


}