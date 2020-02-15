package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bSin, bCos,bTan,bCosec,bSec,bCtg,bLog;
    private TextView hasil;
    private EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSin = findViewById(R.id.bSin);
        bCos = findViewById(R.id.bCos);
        bTan = findViewById(R.id.bTan);
        bCosec = findViewById(R.id.bCosec);
        bSec = findViewById(R.id.bSec);
        bCtg = findViewById(R.id.bCtg);
        bLog = findViewById(R.id.bLog);
        hasil = findViewById(R.id.tvhasil);
        input = findViewById(R.id.etfloat);

        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = Math.sin(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });

        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = Math.cos(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });

        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = Math.tan(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });

        bCosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = 1.0/Math.sin(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });

        bSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = 1.0/Math.cos(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });

        bCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = 1.0/Math.tan(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });

        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sInput = input.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double pHasil = Math.log10(input);
                    String sResult = String.valueOf(pHasil);

                    hasil.setText(sResult);
                }catch (NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong",Toast.LENGTH_SHORT) .show();
                }
            }
        });
    }
}
