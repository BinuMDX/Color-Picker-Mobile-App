package com.binari.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText redValue;
    EditText greenValue;
    EditText blueValue;
    LinearLayout linearLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        redValue = findViewById(R.id.editRedValue);
        greenValue = findViewById(R.id.editGreenValue);
        blueValue = findViewById(R.id.editBlueValue);

        linearLayout = findViewById(R.id.layout);

    }



    public void changeBackground (View view){


        int red = Integer.parseInt(redValue.getText().toString());

        int green = Integer.parseInt(greenValue.getText().toString());

        int blue = Integer.parseInt(blueValue.getText().toString());


        if (red > 255 || red < 0 || green > 255 || green < 0 || blue > 255 || blue < 0) {
            String msg = "Enter a valid number between 0 and 255";
            Toast toast = Toast.makeText(
                    this, msg, Toast.LENGTH_SHORT);
            toast.show();
        } else {
            int color = Color.argb(255, red, green, blue);
            linearLayout.setBackgroundColor(color);
        }

    }

}