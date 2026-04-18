package com.example.assignment4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView t1,t2;
Button btn;
RadioGroup rg;
RadioButton r1,r2,r3;
CheckBox c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            t1=findViewById(R.id.sd);
            t2=findViewById(R.id.sf);
            btn=findViewById(R.id.submit);
            rg=findViewById(R.id.rg);
            r1=findViewById(R.id.android);
            r2=findViewById(R.id.ios);
            r3=findViewById(R.id.windows);
            c1=findViewById(R.id.notification);
            c2=findViewById(R.id.darkmode);
            c3=findViewById(R.id.location);
            c4=findViewById(R.id.backup);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            return insets;
        });
    }
}