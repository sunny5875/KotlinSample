package com.example.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ControlJavaActivity extends AppCompatActivity {

    EditText numberField;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_control);

        numberField=findViewById(R.id.numberField);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=Integer.parseInt(numberField.getText().toString());
                if(number%2==0){
                    //Toast.makeText(getApplicationContext(),"\'"+number+"\'는 2의 배수입니다.",Toast.LENGTH_SHORT).show();
                   // new ToastUtilJava().toastShort("\'"+number+"\'는 2의 배수입니다.");
                    //java가 kotlin 최상위 함수에 접근한 코드
                    ToastUtilKotlinKt.toastShort("\'"+number+"\'는 2의 배수입니다.");
                    //ToastUtilJava.toastShort("\'"+number+"\'는 2의 배수입니다.");


                }
                else if(number%3==0){
                    Toast.makeText(getApplicationContext(),"\'"+number+"\'는 3의 배수입니다.",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"\'"+number+"\'",Toast.LENGTH_SHORT).show();

                }
        //editText와 button 둘다 텍스를 setText()로 가능
                switch (number){
                    case 4:
                        button.setText("실행-4");
                        break;
                    case 9:
                        button.setText("실행-9");
                        break;

                    default:
                        button.setText("실행");
                        break;
                }

            }

        });

    }
}
