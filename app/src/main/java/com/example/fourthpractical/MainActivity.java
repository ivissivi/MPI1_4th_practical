package com.example.fourthpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5,
            btn6, btn7, btn8, btn9, btnAdd, btnSubtract,
            btnDivide, btnMultiply, btn10, btnClear, btnEquals;

    EditText editText;

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
        btn10 = findViewById(R.id.btn10);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnClear = findViewById(R.id.btnClear);
        btnEquals = findViewById(R.id.btnEquals);
        editText = findViewById(R.id.textEdit);


        btn1.setOnClickListener(v -> editText.setText(editText.getText() + "1"));

        btn2.setOnClickListener(v -> editText.setText(editText.getText() + "2"));

        btn3.setOnClickListener(v -> editText.setText(editText.getText() + "3"));

        btn4.setOnClickListener(v -> editText.setText(editText.getText() + "4"));

        btn5.setOnClickListener(v -> editText.setText(editText.getText() + "5"));

        btn6.setOnClickListener(v -> editText.setText(editText.getText() + "6"));

        btn7.setOnClickListener(v -> editText.setText(editText.getText() + "7"));

        btn8.setOnClickListener(v -> editText.setText(editText.getText() + "8"));

        btn9.setOnClickListener(v -> editText.setText(editText.getText() + "9"));

        btn0.setOnClickListener(v -> editText.setText(editText.getText() + "0"));

        btnAdd.setOnClickListener(v -> {

            if (editText == null) {
                assert false;
                editText.setText("");
            } else {
                firstValue = Float.parseFloat(editText.getText() + "");
                calcAdd = true;
                editText.setText(null);
            }
        });

        btnSubtract.setOnClickListener(v -> {
            firstValue = Float.parseFloat(editText.getText() + "");
            calcSubtract = true;
            editText.setText(null);
        });

        btnMultiply.setOnClickListener(v -> {
            firstValue = Float.parseFloat(editText.getText() + "");
            calcMultiply = true;
            editText.setText(null);
        });

        btnDivide.setOnClickListener(v -> {
            firstValue = Float.parseFloat(editText.getText() + "");
            calcDivide = true;
            editText.setText(null);
        });

        btnEquals.setOnClickListener(v -> {
            secondValue = Float.parseFloat(editText.getText() + "");

            if (calcAdd) {
                editText.setText(firstValue + secondValue + "");
                calcAdd = false;
            }

            if (calcSubtract) {
                editText.setText(firstValue - secondValue + "");
                calcSubtract = false;
            }

            if (calcMultiply) {
                editText.setText(firstValue * secondValue + "");
                calcMultiply = false;
            }

            if (calcDivide) {
                editText.setText(firstValue / secondValue + "");
                calcDivide = false;
            }
        });

        btnClear.setOnClickListener(v -> editText.setText(""));

        btn10.setOnClickListener(v -> editText.setText(editText.getText() + "."));
    }
}

