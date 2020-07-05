package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView S;
    private String number = "";
    private double num1 = 0;
    private double num2 = 0;
    private double num3 = 0;
    private String symbol = "";
    private Button N0, N1, N2, N3, N4, N5, N6, N7, N8, N9;
    private Button CE, D, B, SX, SMe, SMa, SR, SC, DMB, DMB2;

    DecimalFormat currency = new DecimalFormat("###.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        S = findViewById(R.id.S);
        N0 = findViewById(R.id.N0);
        N1 = findViewById(R.id.N1);
        N2 = findViewById(R.id.N2);
        N3 = findViewById(R.id.N3);
        N4 = findViewById(R.id.N4);
        N5 = findViewById(R.id.N5);
        N6 = findViewById(R.id.N6);
        N7 = findViewById(R.id.N7);
        N8 = findViewById(R.id.N8);
        N9 = findViewById(R.id.N9);
        CE = findViewById(R.id.CE);
        D = findViewById(R.id.D);
        B = findViewById(R.id.B);
        SX = findViewById(R.id.SX);
        SMe = findViewById(R.id.SMe);
        SMa = findViewById(R.id.SMa);
        SR = findViewById(R.id.SR);
        SC = findViewById(R.id.SC);
        DMB = findViewById(R.id.DMB);
        DMB2 = findViewById(R.id.DMB2);

        N0.setOnClickListener(this);
        N1.setOnClickListener(this);
        N2.setOnClickListener(this);
        N3.setOnClickListener(this);
        N4.setOnClickListener(this);
        N5.setOnClickListener(this);
        N6.setOnClickListener(this);
        N7.setOnClickListener(this);
        N8.setOnClickListener(this);
        N9.setOnClickListener(this);
        CE.setOnClickListener(this);
        D.setOnClickListener(this);
        B.setOnClickListener(this);
        SX.setOnClickListener(this);
        SMe.setOnClickListener(this);
        SMa.setOnClickListener(this);
        SR.setOnClickListener(this);
        SC.setOnClickListener(this);
        DMB.setOnClickListener(this);
        DMB2.setOnClickListener(this);

    }

    //@Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.N0:
                number = number + "0";
                S.setText(number);
                break;
            case R.id.N1:
                number = number + "1";
                S.setText(number);
                break;
            case R.id.N2:
                number = number + "2";
                S.setText(number);
                break;
            case R.id.N3:
                number = number + "3";
                S.setText(number);
                break;
            case R.id.N4:
                number = number + "4";
                S.setText(number);
                break;
            case R.id.N5:
                number = number + "5";
                S.setText(number);
                break;
            case R.id.N6:
                number = number + "6";
                S.setText(number);
                break;
            case R.id.N7:
                number = number + "7";
                S.setText(number);
                break;
            case R.id.N8:
                number = number + "8";
                S.setText(number);
                break;
            case R.id.N9:
                number = number + "9";
                S.setText(number);
                break;
            case R.id.DMB2:
                S.setText("ERROR");
                break;
            case R.id.DMB:
                S.setText("DANIEL MUÑOZ BRICEÑO");
                break;
            case R.id.SX:
                symbol = "x";
                if (num1 != 0) {
                    num1 = Double.parseDouble(number) * num1;
                } else {
                    num1 = Double.parseDouble(number);
                }
                number = "";
                break;
            case R.id.SC:
                number = number + ".";
                S.setText("" + number);
                break;
            case R.id.D:
                symbol = "/";
                if (num1 != 0) {
                    num1 = Double.parseDouble(number) / num1;
                } else {
                    num1 = Double.parseDouble(number);
                }
                number = "";
                break;
            case R.id.SMa:
                symbol = "+";
                num1 += Double.parseDouble(number);
                number = "";
                break;
            case R.id.SMe:
                symbol = "-";
                if (num1 != 0) {
                    num1 = Double.parseDouble(number) - num1;
                } else {
                    num1 = Double.parseDouble(number);
                }
                number = "";
                break;
            case R.id.CE:
                symbol = "";
                num1 = 0;
                num2 = 0;
                num3 = 0;
                number = "";
                S.setText("");
                break;
            case R.id.B:
                number = number.substring(0, number.length() - 1);
                S.setText("" + number);
                break;
            case R.id.SR:
                num2 = Double.parseDouble(number);
                switch (symbol) {
                    case "+":
                        S.setText("" + (num1 + num2));
                        num3 = (num1 + num2);
                        if (num3 % 1 == 0) {
                            S.setText("" + currency.format(num1 + num2));
                        } else {
                            S.setText("" + (num1 + num2));
                        }
                        num3 = 0;
                        break;
                    case "-":
                        S.setText("" + (num1 - num2));
                        num3 = (num1 - num2);
                        if (num3 % 1 == 0) {
                            S.setText("" + currency.format(num1 - num2));
                        } else {
                            S.setText("" + (num1 - num2));
                        }
                        num3 = 0;
                        break;
                    case "x":
                        S.setText("" + (num1 * num2));
                        num3 = (num1 * num2);
                        if (num3 % 1 == 0) {
                            S.setText("" + currency.format(num1 * num2));
                        } else {
                            S.setText("" + (num1 * num2));
                        }
                        num3 = 0;
                        break;
                    case "/":
                        S.setText("" + (num1 / num2));
                        num3 = (num1 / num2);
                        if (num3 % 1 == 0) {
                            S.setText("" + currency.format(num1 / num2));
                        } else {
                            S.setText("" + (num1 / num2));
                        }
                        num3 = 0;
                        break;
                }
        }
    }
}