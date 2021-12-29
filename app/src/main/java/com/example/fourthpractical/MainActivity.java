package com.example.fourthpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5,
            btn6, btn7, btn8, btn9, btnAdd, btnSubtract,
            btnDivide, btnMultiply, btnDecimal, btnClear, btnEquals;

    TextView inputField;

    float firstValue, secondValue;

    boolean calcAdd, calcSubtract, calcMultiply, calcDivide;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnClear = findViewById(R.id.btnClear);
        btnEquals = findViewById(R.id.btnEquals);
        inputField = findViewById(R.id.txtView);

        btn1.setOnClickListener(v -> inputField.setText(inputField.getText() + "1"));

        btn2.setOnClickListener(v -> inputField.setText(inputField.getText() + "2"));

        btn3.setOnClickListener(v -> inputField.setText(inputField.getText() + "3"));

        btn4.setOnClickListener(v -> inputField.setText(inputField.getText() + "4"));

        btn5.setOnClickListener(v -> inputField.setText(inputField.getText() + "5"));

        btn6.setOnClickListener(v -> inputField.setText(inputField.getText() + "6"));

        btn7.setOnClickListener(v -> inputField.setText(inputField.getText() + "7"));

        btn8.setOnClickListener(v -> inputField.setText(inputField.getText() + "8"));

        btn9.setOnClickListener(v -> inputField.setText(inputField.getText() + "9"));

        btn0.setOnClickListener(v -> inputField.setText(inputField.getText() + "0"));

        btnAdd.setOnClickListener(v -> {

            if (inputField == null) {
                assert false;
                inputField.setText("");
            } else {
                firstValue = Float.parseFloat(inputField.getText() + "");
                calcAdd = true;
                inputField.setText(null);
            }
        });

        btnSubtract.setOnClickListener(v -> {
            firstValue = Float.parseFloat(inputField.getText() + "");
            calcSubtract = true;
            inputField.setText(null);
        });

        btnMultiply.setOnClickListener(v -> {
            firstValue = Float.parseFloat(inputField.getText() + "");
            calcMultiply = true;
            inputField.setText(null);
        });

        btnDivide.setOnClickListener(v -> {
            firstValue = Float.parseFloat(inputField.getText() + "");
            calcDivide = true;
            inputField.setText(null);
        });

        btnEquals.setOnClickListener(v -> {
            secondValue = Float.parseFloat(inputField.getText() + "");

            if (calcAdd) {
                inputField.setText(firstValue + secondValue + "");
                calcAdd = false;
            }

            if (calcSubtract) {
                inputField.setText(firstValue - secondValue + "");
                calcSubtract = false;
            }

            if (calcMultiply) {
                inputField.setText(firstValue * secondValue + "");
                calcMultiply = false;
            }

            if (calcDivide) {
                inputField.setText(firstValue / secondValue + "");
                calcDivide = false;
            }
        });

        btnClear.setOnClickListener(v -> inputField.setText(""));

        btnDecimal.setOnClickListener(v -> inputField.setText(inputField.getText() + "."));
    }
}

