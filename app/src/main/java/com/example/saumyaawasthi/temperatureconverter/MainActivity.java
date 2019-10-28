package com.example.saumyaawasthi.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void celcius(View view) {
        EditText cel = (EditText) findViewById(R.id.editText1);
        if (cel.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter the temperature", Toast.LENGTH_SHORT).show();
        } else {
            double c1 = Double.parseDouble(cel.getText().toString());
            double f1 = c1 * 1.8 + 32;
            double k1 = c1 + 273;
            Log.i("celcius", "clicked" + cel.getText().toString());
            String f11 = Double.toString(f1);
            String k11 = Double.toString(k1);
            Toast.makeText(this, "Fahrenheit temperature is " + f11 + "\n Kelvin temperature is " + k11, Toast.LENGTH_LONG).show();
        }
    }
    public void fah(View view) {
        EditText f = (EditText) findViewById(R.id.editText2);
        if (f.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter the temperature", Toast.LENGTH_SHORT).show();
        } else {
            double f2 = Double.parseDouble(f.getText().toString());
            double c2 = (f2 - 32) * 5 / 9;
            double k2 = c2 + 273;
            String c22 = Double.toString(c2);
            String k22 = Double.toString(k2);
            Toast.makeText(this, "Celcius temperature is " + c22 + "\n Kelvin temperature is " + k22, Toast.LENGTH_LONG).show();
        }
    }
    public void kelvin(View view) {
        EditText k = (EditText) findViewById(R.id.editText3);
        if (k.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter the temperature", Toast.LENGTH_SHORT).show();
        } else {
            double k3 = Double.parseDouble(k.getText().toString());
            double c3 = k3 - 273;
            double f3 = c3 * 1.8 + 32;
            String c33 = Double.toString(c3);
            String f33 = Double.toString(f3);
            Toast.makeText(this, "Celcius temp. is " + c33 + "\n Fahrenheit temp. is " + f33, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
