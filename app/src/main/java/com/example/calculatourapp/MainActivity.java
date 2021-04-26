package com.example.calculatourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText num1 , num2;
    TextView res;
    Button add, sub , multi , div , clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.first_number_et);
        num2 =findViewById(R.id.second_number_et);
        res= findViewById(R.id.result_tv);
        add = findViewById(R.id.add_btn);
        sub = findViewById(R.id.sub_btn);
        multi= findViewById(R.id.multi_btn);
        div = findViewById(R.id.divid_btn);
        clear = findViewById(R.id.clear_btn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ft = num1.getText().toString();
                String sc = num2.getText().toString();
                //parse String to integer
                int number1 = Integer.parseInt(ft);
                int number2 = Integer.parseInt(sc);
                int result = number1+number2;
                res.append(result+" ");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ft = num1.getText().toString();
                String sc = num2.getText().toString();
                //parse String to integer
                int number1 = Integer.parseInt(ft);
                int number2 = Integer.parseInt(sc);
                int result = number1-number2;
                res.append(result+" ");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ft = num1.getText().toString();
                String sc = num2.getText().toString();
                //parse String to integer
                int number1 = Integer.parseInt(ft);
                int number2 = Integer.parseInt(sc);
                int result = number1*number2;
                res.append(result+" ");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ft = num1.getText().toString();
                String sc = num2.getText().toString();
                //parse String to integer
                int number1 = Integer.parseInt(ft);
                int number2 = Integer.parseInt(sc);
                int result = number1/number2;
                res.append(result+" ");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = res.getText().toString();
                    res.setText(" ");
                }
                    

        });
    }
}