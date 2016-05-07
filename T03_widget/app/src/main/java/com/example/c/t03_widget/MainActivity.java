package com.example.c.t03_widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTest = (Button) findViewById(R.id.btnwg);

        Button btn3 = (Button)findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText etTest =  (EditText)findViewById(R.id.etwg);

                if(etTest.getText().length()==0) {
                    Toast.makeText(MainActivity.this, "데이터를 입력해", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, etTest.getText(), Toast.LENGTH_SHORT).show();
                    etTest.setText("잘햇네");
                }
            }
        });

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

        RadioGroup rg = (RadioGroup) findViewById(R.id.rgwg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton)findViewById(checkedId);
                Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
