package com.example.assignment3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,sub,mul,div;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            add=findViewById(R.id.add);
            sub=findViewById(R.id.sub);
            mul=findViewById(R.id.mul);
            div=findViewById(R.id.div);
            num1=findViewById(R.id.first);
            num2=findViewById(R.id.second);
            output=findViewById(R.id.output);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b = Integer.parseInt(num2.getText().toString());
                    int c = a+b;
                    output.setText("Addition of " + ""+a+" and "+b+" = "+c);
                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b = Integer.parseInt(num2.getText().toString());
                    int c = a-b;
                    output.setText("Subtraction of " + ""+a+" and "+b+" = "+c);
                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b = Integer.parseInt(num2.getText().toString());
                    int c = a*b;
                    output.setText("Multiplication of " + ""+a+" and "+b+" = "+c);
                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b = Integer.parseInt(num2.getText().toString());
                    int c = a/b;
                    output.setText("Divison of " + ""+a+" and "+b+" = "+c);
                }
            });
            return insets;
        });
    }
}