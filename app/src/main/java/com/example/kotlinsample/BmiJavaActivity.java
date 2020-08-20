package com.example.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiJavaActivity extends AppCompatActivity {

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmibutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ui로 사용할 레이아웃 xml 파일을 지정
        setContentView(R.layout.layout_view_binding);

        //ui 요소 멤버변수를 xml 레이아웃에서 findVieyBYId 함수를 이용하여 바인딩한다.
        tallField=findViewById(R.id.tallField);
        weightField=findViewById(R.id.weightField);
        resultLabel=findViewById(R.id.resultLabel);
        bmibutton=findViewById(R.id.bmibutton);

        bmibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tallField의 값을 읽어온다.(EditText은 사용자에게 받아오는 값을 저장하는 자료형)

                String tall=tallField.getText().toString();

                String weight=weightField.getText().toString();

                double bmi=Double.parseDouble(weight)/Math.pow(Double.parseDouble(tall)/100.0,2);

                resultLabel.setText("키 : "+tall + ", 체중 : "+weight+", BMI : "+ bmi);
                String s="키 : "+tall + ", 체중 : "+weight+", BMI : "+ bmi;

                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
