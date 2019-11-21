package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg_gender;
    private RadioButton rd_man,rd_woman;
    private Button btn_result;
    private String str_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_gender = findViewById(R.id.rg_gender);
        rd_man = findViewById(R.id.rd_man);
        rd_woman = findViewById(R.id.rd_woman);
        btn_result = findViewById(R.id.btn_result);

        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.rd_man){
                    Toast.makeText(MainActivity.this,"남자라디오버튼",Toast.LENGTH_SHORT).show();
                    str_result = rd_man.getText().toString();
                }else if(checkedId == R.id.rd_woman){
                    Toast.makeText(MainActivity.this,"여자라디오버튼",Toast.LENGTH_SHORT).show();
                    str_result = rd_woman.getText().toString();
                }

            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str_result != null){
                    Toast.makeText(MainActivity.this,str_result,Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"버튼을 선택해주세요",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
