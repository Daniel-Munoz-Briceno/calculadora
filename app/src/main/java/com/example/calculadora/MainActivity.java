package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView S;
    private String number;
    private int num1, num2;
    private String symbol;
    private Button N0, N1, N2, N3, N4, N5, N6, N7, N8, N9;
    private Button SP, CE, D, B, SX, SMe, SMa, SR, SC, SMM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView S = findViewById(R.id.S);
        Button N0 = findViewById(R.id.N0);
        Button N1 = findViewById(R.id.N1);
        Button N2 = findViewById(R.id.N2);
        Button N3 = findViewById(R.id.N3);
        Button N4 = findViewById(R.id.N4);
        Button N5 = findViewById(R.id.N5);
        Button N6 = findViewById(R.id.N6);
        Button N7 = findViewById(R.id.N7);
        Button N8 = findViewById(R.id.N8);
        Button N9 = findViewById(R.id.N9);
        Button SP = findViewById(R.id.SP);
        Button CE = findViewById(R.id.CE);
        Button D = findViewById(R.id.D);
        Button B = findViewById(R.id.B);
        Button SX = findViewById(R.id.SX);
        Button SMe = findViewById(R.id.SMe);
        Button SMa = findViewById(R.id.SMa);
        Button SR = findViewById(R.id.SR);
        Button SC = findViewById(R.id.SC);
        Button SMM = findViewById(R.id.SMM);

        N0.setOnClickListener((View.OnClickListener) this);
        N1.setOnClickListener((View.OnClickListener) this);
        N2.setOnClickListener((View.OnClickListener) this);
        N3.setOnClickListener((View.OnClickListener) this);
        N4.setOnClickListener((View.OnClickListener) this);
        N5.setOnClickListener((View.OnClickListener) this);
        N6.setOnClickListener((View.OnClickListener) this);
        N7.setOnClickListener((View.OnClickListener) this);
        N8.setOnClickListener((View.OnClickListener) this);
        N9.setOnClickListener((View.OnClickListener) this);
        SP.setOnClickListener((View.OnClickListener) this);
        CE.setOnClickListener((View.OnClickListener) this);
        D.setOnClickListener((View.OnClickListener) this);
        B.setOnClickListener((View.OnClickListener) this);
        SX.setOnClickListener((View.OnClickListener) this);
        SMe.setOnClickListener((View.OnClickListener) this);
        SMa.setOnClickListener((View.OnClickListener) this);
        SR.setOnClickListener((View.OnClickListener) this);
        SC.setOnClickListener((View.OnClickListener) this);
        SMM.setOnClickListener((View.OnClickListener) this);
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

            case R.id.SP:
                number = number + "/";
                S.setText(number);
                break;
            case R.id.CE:
            case R.id.B:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                S.setText("0");
                break;
            case R.id.SX:
                symbol = "x";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.D:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.SMa:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.SMe:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.SR:
                num2 = Integer.parseInt(number);
                switch (symbol) {
                    case "+":
                        S.setText("S: " +(num1+ num2));
                        break;
                    case "-":
                        S.setText("S: " +(num1- num2));
                        break;
                    case "x":
                        S.setText("S: " +(num1* num2));
                        break;
                    case "/":
                        S.setText("S: " +(num1/ num2));
                        break;
                }
                num1 = 0;
                num2 = 0;
                number = "0";
                break;
        }
    }
}
