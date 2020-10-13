package com.example.calcinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclear,bdivide,bminus,bplus,bdot, bmultiple, bequal;
    EditText calculateText;
    double _value1, _value2;
    boolean isAdd, isSub, isMultiple, isDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.button0);
        b1= (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        bclear = (Button) findViewById(R.id.button_clear);
        bdivide = (Button) findViewById(R.id.button_divide);
        bminus = (Button) findViewById(R.id.button_minus);
        bplus = (Button) findViewById(R.id.button_plus);
        bdot = (Button) findViewById(R.id.button_dot);
        bmultiple = (Button) findViewById(R.id.buttonX);
        bequal = (Button) findViewById(R.id.button_equal);
        calculateText = (EditText) findViewById(R.id.calculateText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + "0");
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(null);
            }
        });
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _value1 = Double.parseDouble(calculateText.getText() + "");
                isDiv = true;
                calculateText.setText(null);
            }
        });
        bmultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _value1 = Double.parseDouble(calculateText.getText() + "");
                isMultiple = true;
                calculateText.setText(null);
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _value1 = Double.parseDouble(calculateText.getText() + "");
                isSub = true;
                calculateText.setText(null);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculateText == null)
                    calculateText.setText("");
                else {
                    _value1 = Double.parseDouble(calculateText.getText() + "");
                    isAdd = true;
                    calculateText.setText(null);
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateText.setText(calculateText.getText() + ".");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _value2 = Double.parseDouble(calculateText.getText() + "");
                if (isAdd == true) {
                    calculateText.setText(_value1 + _value2 + "");
                    isAdd = false;
                }

                if (isSub == true) {
                    calculateText.setText(_value1 - _value2 + "");
                    isSub = false;
                }

                if (isMultiple == true) {
                    calculateText.setText(_value1 * _value1 + "");
                    isMultiple = false;
                }

                if (isDiv == true) {
                    calculateText.setText(_value1 / _value2 + "");
                    isDiv = false;
                }
            }
        });
    }


}