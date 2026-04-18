package com.example.assignment4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioGroup rg;
    TextView t1,t2;
    CheckBox c1,c2,c3,c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            btn=findViewById(R.id.btn);
            rg=findViewById(R.id.rg);
            c1=findViewById(R.id.notification);
            c2=findViewById(R.id.darkmode);
            c3=findViewById(R.id.locationservice);
            c4=findViewById(R.id.backup);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId=rg.getCheckedRadioButtonId();
                    t1=findViewById(selectedId);
                    String deviceOutput=t1.getText().toString();
                    String feature = "";
                    if(c1.isChecked())
                        feature=c1.getText().toString();
                    if(c2.isChecked())
                        feature=feature+" "+c2.getText().toString();
                    if(c3.isChecked())
                        feature=feature+" "+c3.getText().toString();
                    if(c4.isChecked())
                        feature=feature+" "+c4.getText().toString();
                    t2.setText(t2.getText().toString()+" "+feature);

                }
            });


            return insets;
        });
    }
}