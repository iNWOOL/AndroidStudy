package com.example.c.t03_widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTest = (Button) findViewById(R.id.btnwg);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"눌렷당",Toast.LENGTH_SHORT).show();
            }
        });

        final CheckBox chkTest = (CheckBox) findViewById(R.id.chkwg);
        chkTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkTest.isChecked()){
                    Toast.makeText(MainActivity.this,"체크됫당",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"체크안됫당",Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);

    }
}
