package com.burhan.easycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 =0, input2 = 0;
    boolean Add, Sub, Multi, Div;
    TextView SetText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SetText = (TextView) findViewById(R.id.textView);

        Button One = (Button) findViewById(R.id.one);
        Button Two = (Button) findViewById(R.id.two);
        Button Three = (Button) findViewById(R.id.three);
        Button Four = (Button) findViewById(R.id.four);
        Button Five = (Button) findViewById(R.id.five);
        Button Six = (Button) findViewById(R.id.six);
        Button Seven = (Button) findViewById(R.id.seven);
        Button Eight = (Button) findViewById(R.id.eight);
        Button Nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);

        final Button Addition = (Button) findViewById(R.id.plus);
        Button Subtraction = (Button) findViewById(R.id.minus);
        Button Multiply = (Button) findViewById(R.id.multiply);
        Button Division = (Button) findViewById(R.id.divide);
        Button Equal = (Button) findViewById(R.id.equal);

        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            SetText.setText(SetText.getText()+"1");
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"2");
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"3");
            }
        });

        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"4");
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"5");
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"6");
            }
        });

        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"7");
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"8");
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetText.setText(SetText.getText()+"0");
            }
        });


        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SetText.getText().length() != 0){
                 input1 =Float.parseFloat(SetText.getText() +"");
                    Add =true;
                    SetText.setText(null);
                }
            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SetText.getText().length() != 0){
                    input1 =Float.parseFloat(SetText.getText() +"");
                    Sub = true;
                    SetText.setText(null);
                }
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SetText.getText().length() != 0){
                    input1 =Float.parseFloat(SetText.getText() +"");
                    Multi =true;
                    SetText.setText(null);
                }
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SetText.getText().length() != 0){
                    input1 =Float.parseFloat(SetText.getText() +"");
                    Div = true;
                    SetText.setText(null);
                }
            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Sub || Div || Multi){
                   input2 = Float.parseFloat(SetText.getText() + "");

                    if (Add){
                        SetText.setText(input2+input1 +"");
                        Add=false;
                    }
                    if (Multi){
                        SetText.setText(input1*input2 +"");
                        Multi = false;
                    }
                    if (Sub){
                        SetText.setText(input1-input2 +"");
                        Sub = false;
                    }
                    if (Div){
                        SetText.setText(input1/input2 +"");
                        Div = false;
                    }
                }
            }
        });
    }
}
