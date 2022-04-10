package com.example.gbandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Number1;
    EditText Number2;

    Button key_minus;
    Button key_plus;
    Button key_multiply;
    Button key_divide;

    TextView finalresult;

    String oper = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        Number1 = (EditText)  findViewById(R.id.firstnumber);
        Number2 = (EditText)  findViewById(R.id.secondnumber);

        key_plus = (Button) findViewById(R.id.key_plus);
        key_minus = (Button) findViewById(R.id.key_minus);
        key_multiply = (Button) findViewById(R.id.key_multiply);
        key_divide = (Button) findViewById(R.id.key_divide);

        finalresult = (TextView) findViewById(R.id.finalresult);

                key_plus.setOnClickListener ((View.OnClickListener) this);
        key_minus.setOnClickListener ((View.OnClickListener) this);
        key_multiply.setOnClickListener ((View.OnClickListener) this);
        key_divide.setOnClickListener ((View.OnClickListener) this);
    }
    public void onClick(View v) {
        float number1 = 0;
        float number2 = 0;
        float result = 0;

        number1 = Float.parseFloat(Number1.getText().toString());
        number2 = Float.parseFloat(Number2.getText().toString());

        switch (v.getId()) {
            case R.id.key_plus:
                oper = "+";
                result = number1 + number2;
            case R.id.key_minus:
                oper = "-";
                result = number1 - number2;
            case R.id.key_multiply:
                oper = "*";
                result = number1 * number2;
            case R.id.key_divide:
                oper = "/";
                result = number1 / number2;
                break;
            default:
                break;

        }
        finalresult.setText(number1 + " " + oper + " " + number2 + " = " + result);
    }

}