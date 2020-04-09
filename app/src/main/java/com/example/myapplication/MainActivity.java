package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private Button b,b1,b3,b4;
    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById((R.id.editText));
        e2=(EditText)findViewById((R.id.editText2));
        b=(Button)findViewById((R.id.button));
        b1=(Button)findViewById((R.id.button2));
        b3=(Button)findViewById((R.id.button3));
        b4=(Button)findViewById((R.id.button4));
        t=(TextView) findViewById((R.id.textView2));

        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                t.setText("Result:"+(a+b));
            }
        });
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                t.setText("Result:"+(a-b));
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                t.setText("Result:"+(a*b));
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                t.setText("Result:"+(a/b));
            }
        });

    }
}
