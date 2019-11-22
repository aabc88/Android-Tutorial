package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_red,chk_green,chk_blue;
    private TextView tv_result;
    private Button btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk_red = findViewById(R.id.chk_red);
        chk_green = findViewById(R.id.chk_green);
        chk_blue = findViewById(R.id.chk_blue);
        btn_result = findViewById(R.id.btn_result);
        tv_result = findViewById(R.id.tv_result);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_result = ""; //String값 초기화

                if(chk_red.isChecked()){
                    str_result += chk_red.getText().toString();
                }if(chk_blue.isChecked()){
                    str_result += chk_blue.getText().toString();
                }if(chk_green.isChecked()){
                    str_result += chk_green.getText().toString();
                }
                tv_result.setText(str_result);
            }
        });

    }
}

