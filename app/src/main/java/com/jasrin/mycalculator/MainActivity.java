package com.jasrin.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText etxtNumber1,etxtNumber2;
    Button btnPlus,btnMinus,btnMul,btnDiv,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult=findViewById(R.id.txt_result);
        etxtNumber1=findViewById(R.id.txt_number1);
        etxtNumber2=findViewById(R.id.txt_number2);


        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMul=findViewById(R.id.btn_mul);
        btnDiv=findViewById(R.id.btn_div);
        btnClear=findViewById(R.id.btn_clear);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxtNumber1.getText().toString();
                String number2=etxtNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1+value2;
                    txtResult.setText(""+result);

                    //Log.d("sum",)
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please Enter Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxtNumber1.getText().toString();
                String number2=etxtNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1-value2;
                    txtResult.setText(""+result);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please Enter Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxtNumber1.getText().toString();
                String number2=etxtNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1*value2;
                    txtResult.setText(""+result);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please Enter Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxtNumber1.getText().toString();
                String number2=etxtNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1/value2;
                    txtResult.setText(""+result);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please Enter Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("0");
                etxtNumber1.setText("");
                etxtNumber2.setText("");
            }
        });

    }
}
