package com.example.calculatorx;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnTimes;
    private Button btnDivide;
    private Button btnEqual;
    private Button btnClear;
    private TextView editDisplay;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTYPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2 = Double.NaN;
    private int Val1 = 0;
    private String value1 = "";
    private String value2 = "";
    private char act;
    int where = 0;
    int age = 0;
    int acttime = 0;
    int end = 0;
    int neweq = 0;
    int rounded = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "0";
                    }
                    if (neweq == 1){
                        value1 = "0";
                    }
                }
                if (where == 1){
                    value2 += "0";
                }
                editDisplay.setText(editDisplay.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "1";
                    }
                    if (neweq == 1){
                        value1 = "2";
                    }
                }
                if (where == 1){
                    value2 += "1";
                }
                editDisplay.setText(editDisplay.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "2";
                    }
                    if (neweq == 1){
                        value1 = "2";
                    }
                }
                if (where == 1){
                    value2 += "2";
                }
                editDisplay.setText(editDisplay.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "3";
                    }
                    if (neweq == 1){
                        value1 = "3";
                    }
                }
                if (where == 1){
                    value2 += "3";
                }
                editDisplay.setText(editDisplay.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "4";
                    }
                    if (neweq == 1){
                        value1 = "4";
                    }
                }
                if (where == 1){
                    value2 += "4";
                }
                editDisplay.setText(editDisplay.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "5";
                    }
                    if (neweq == 1){
                        value1 = "5";
                    }
                }
                if (where == 1){
                    value2 += "5";
                }
                editDisplay.setText(editDisplay.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "6";
                    }
                    if (neweq == 1){
                        value1 = "6";
                    }
                }
                if (where == 1){
                    value2 += "6";
                }
                editDisplay.setText(editDisplay.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "7";
                    }
                    if (neweq == 1){
                        value1 = "7";
                    }
                }
                if (where == 1){
                    value2 += "7";
                }
                editDisplay.setText(editDisplay.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "8";
                    }
                    if (neweq == 1){
                        value1 = "8";
                    }
                }
                if (where == 1){
                    value2 += "8";
                }
                editDisplay.setText(editDisplay.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testForActiontime();
                if (where == 0){
                    if (val1 != Double.NaN){
                        val1 = Double.NaN;
                        age = 0;
                    }
                    if (neweq == 0){
                        value1 += "9";
                    }
                    if (neweq == 1){
                        value1 = "9";
                    }
                }
                if (where == 1){
                    value2 += "9";
                }
                editDisplay.setText(editDisplay.getText() + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acttime == 0){
                    acttime = 1;
                    if (value1 == "" && age == 1) {
                        if (rounded == 0) {
                            value1 += val1;
                        }
                        if (rounded == 1) {
                            value1 += Val1;
                        }
                    }
                    if (value1 != "" && value2 == "" && age == 1) {
                        if (rounded == 0){
                            editDisplay.setText(String.valueOf(val1));
                        }
                        if (rounded == 1){
                            editDisplay.setText(String.valueOf(Val1));
                        }
                        editDisplay.setText(editDisplay.getText() + " + ");
                        act = ADDITION;
                        where = 1;
                    }
                    if (value1 != "" && value2 == "" && age == 0) {
                        editDisplay.setText(editDisplay.getText() + " + ");
                        act = ADDITION;
                        where = 1;
                    }
                    if (value1 != "" && value2 != ""){acttime = 0;}
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acttime == 0){
                    acttime = 1;
                    if (value1 == "" && age == 1) {
                        if (rounded == 0) {
                            value1 += val1;
                        }
                        if (rounded == 1) {
                            value1 += Val1;
                        }
                    }
                    if (value1 != "" && value2 == "" && age == 1) {
                        if (rounded == 0){
                            editDisplay.setText(String.valueOf(val1));
                        }
                        if (rounded == 1){
                            editDisplay.setText(String.valueOf(Val1));
                        }
                        editDisplay.setText(editDisplay.getText() + " - ");
                        act = SUBTRACTION;
                        where = 1;
                    }
                    if (value1 != "" && value2 == "" && age == 0) {
                        editDisplay.setText(editDisplay.getText() + " - ");
                        act = SUBTRACTION;
                        where = 1;
                    }
                    if (value1 != "" && value2 != ""){acttime = 0;}
                }
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acttime == 0){
                    acttime = 1;
                    if (value1 == "" && age == 1) {
                        if (rounded == 0) {
                            value1 += val1;
                        }
                        if (rounded == 1) {
                            value1 += Val1;
                        }
                    }
                    if (value1 != "" && value2 == "" && age == 1) {
                        if (rounded == 0){
                            editDisplay.setText(String.valueOf(val1));
                        }
                        if (rounded == 1){
                            editDisplay.setText(String.valueOf(Val1));
                        }
                        editDisplay.setText(editDisplay.getText() + " x ");
                        act = MULTYPLICATION;
                        where = 1;
                    }
                    if (value1 != "" && value2 == "" && age == 0) {
                        editDisplay.setText(editDisplay.getText() + " x ");
                        act = MULTYPLICATION;
                        where = 1;
                    }
                    if (value1 != "" && value2 != ""){acttime = 0;}
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acttime == 0){
                    acttime = 1;
                    if (value1 == "" && age == 1) {
                        if (rounded == 0) {
                            value1 += val1;
                        }
                        if (rounded == 1) {
                            value1 += Val1;
                        }
                    }
                    if (value1 != "" && value2 == "" && age == 1) {
                        if (rounded == 0){
                            editDisplay.setText(String.valueOf(val1));
                        }
                        if (rounded == 1){
                            editDisplay.setText(String.valueOf(Val1));
                        }
                        editDisplay.setText(editDisplay.getText() + " / ");
                        act = DIVISION;
                        where = 1;
                    }
                    if (value1 != "" && value2 == "" && age == 0) {
                        editDisplay.setText(editDisplay.getText() + " / ");
                        act = DIVISION;
                        where = 1;
                    }
                    if (value1 != "" && value2 != ""){acttime = 0;}
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (val1 == Double.NaN && val2 == Double.NaN){
                    editDisplay.setText(null);
                    if (value1 != ""){
                        result.setText(value1);
                    }
                    else{
                        result.setText(null);
                    }
                }
                else if (value1 != "" && value2 == "" && acttime != 1){
                    editDisplay.setText(null);
                    val1 = Double.parseDouble(value1);
                    rounder();
                    if (rounded == 0){result.setText(String.valueOf(val1));}
                    if (rounded == 1){result.setText(String.valueOf(Val1));}
                    age = 1;
                    neweq = 1;
                }
                else if (acttime == 1){
                    editDisplay.setText(null);
                    val1 = Double.parseDouble(value1);
                    rounder();
                    if (rounded == 0){result.setText(String.valueOf(val1));}
                    if (rounded == 1){result.setText(String.valueOf(Val1));}
                    age = 1;
                    neweq = 1;
                }
                else{
                    calculate();
                    if (val1 == Double.NaN){
                        result.setText(null);
                    }
                    else{
                        if (rounded == 1){
                            result.setText(String.valueOf(Val1));
                        }
                        else{
                            result.setText(String.valueOf(val1));
                        }
                    }
                    act = EQU;
                    editDisplay.setText(null);
                    where = 0;
                    age = 1;
                    end = 1;
                }
                testForActiontime();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editDisplay.getText().length() == 0 || editDisplay.getText().length() == 1){
                    editDisplay.setText(null);
                    result.setText(null);
                    value1 = "";
                    val1 = Double.NaN;
                }
                else if (editDisplay.getText().length() > 1 && acttime != 1){
                    CharSequence name = editDisplay.getText().toString();
                    editDisplay.setText(name.subSequence(0, name.length() - 1));
                    if (where == 0){
                        value1 = value1.substring(0, value1.length()-1);
                    }
                    if (where == 1){
                        if (value2.length() == 1){
                            value2 = "";
                            acttime = 1;
                        }
                        else{
                            value2 = value2.substring(0, value2.length()-1);
                        }
                    }
                }
                else if (acttime == 1){
                    testForActiontime();
                    CharSequence name = editDisplay.getText().toString();
                    editDisplay.setText(name.subSequence(0, name.length() - 3));
                    where = 0;
                    act = EQU;
                }
            }
        });
    }

    private void testForActiontime(){
        if(acttime == 1){
            acttime = 0;
        }
    }

    private void calculate(){
        switch (act){
            case ADDITION:
                val1 = Double.parseDouble(value1);
                val2 = Integer.parseInt(value2);
                value1 = "";
                value2 = "";
                val1 += val2;
                rounder();
                testing();
                break;
            case SUBTRACTION:
                val1 = Double.parseDouble(value1);
                val2 = Integer.parseInt(value2);
                value1 = "";
                value2 = "";
                val1 -= val2;
                rounder();
                testing();
                break;
            case MULTYPLICATION:
                val1 = Double.parseDouble(value1);
                val2 = Integer.parseInt(value2);
                value1 = "";
                value2 = "";
                val1 *= val2;
                rounder();
                testing();
                break;
            case DIVISION:
                val1 = Double.parseDouble(value1);
                val2 = Integer.parseInt(value2);
                value1 = "";
                value2 = "";
                val1 /= val2;
                rounder();
                testing();
                break;
            case EQU:
                break;
        }
    }


    private void testing(){
        int x = 2;
        x = (int) (val1 % 2);
        if (val1 != 0){
            if (x == 0){
                Toast.makeText(this, "You've got an even number there!", Toast.LENGTH_SHORT).show();
            }
            else if (x == 1){
                Toast.makeText(this, "You've got an odd number there!", Toast.LENGTH_SHORT).show();
            }
        }
        x = 2;
    }

    private void rounder(){
        value1 = String.valueOf(val1);
        rounded = 0;;
        String s = null;
        int a = 0;
        int b = 0;
        int d = 0;
        boolean round = true;
        for (int f = 0; f < value1.length(); f++){
            char c = value1.charAt(f);
            if (c == '.'){
                a = 1;
            }
            if (a == 0){
                b++;
            }
            if (d == 1 && c != '0'){
                round = false;
            }
            if (a == 1){d = 1;}
        }
        if (round){
            value1 = value1.substring(0, b);
            Val1 = Integer.parseInt(value1);
            rounded = 1;
        }
        value1 = "";
    }

    private void setupViews(){
        btn0 = (Button) findViewById(R.id.b0);
        btn1 = (Button) findViewById(R.id.b1);
        btn2 = (Button) findViewById(R.id.b2);
        btn3 = (Button) findViewById(R.id.b3);
        btn4 = (Button) findViewById(R.id.b4);
        btn5 = (Button) findViewById(R.id.b5);
        btn6 = (Button) findViewById(R.id.b6);
        btn7 = (Button) findViewById(R.id.b7);
        btn8 = (Button) findViewById(R.id.b8);
        btn9 = (Button) findViewById(R.id.b9);
        btnPlus = (Button) findViewById(R.id.b_plus);
        btnMinus = (Button) findViewById(R.id.b_minus);
        btnTimes = (Button) findViewById(R.id.b_times);
        btnDivide = (Button) findViewById(R.id.b_divide);
        btnEqual = (Button) findViewById(R.id.b_equal);
        btnClear = (Button) findViewById(R.id.b_clear);
        editDisplay = (TextView) findViewById(R.id.editDisplayText);
        result = (TextView) findViewById(R.id.result);
    }

}