package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2,ch3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            ch1=findViewById(R.id.dance);
            ch2=findViewById(R.id.sing);
            ch3=findViewById(R.id.travel);
            ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
                    if(b==true)
                        Toast.makeText(getApplicationContext(),"Dancing is Selected",Toast.LENGTH_LONG).show();
                }
            });
//            btn=findViewById(R.id.btn);
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    String hobbies="";
//                    if(ch1.isChecked()==true)
//                        hobbies=ch1.getText().toString();
//                    if(ch2.isChecked()==true)
//                        hobbies=hobbies+" "+ch2.getText().toString();
//                    if(ch3.isChecked()==true)
//                        hobbies=hobbies+" "+ch3.getText().toString();
//                    Toast.makeText(getApplicationContext(),hobbies,Toast.LENGTH_LONG).show();
//                }
//            });
            return insets;
        });
    }
}