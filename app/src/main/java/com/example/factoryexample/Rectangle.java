package com.example.factoryexample;

import android.content.Context;
import android.widget.Toast;

public class Rectangle implements Shape {
    @Override
    public void draw(Context context) {
        Toast.makeText(context,"Inside Rectangle : draw method",Toast.LENGTH_LONG).show();

    }
}
