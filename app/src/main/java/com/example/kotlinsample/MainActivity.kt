package com.example.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//코틀린에서는 상속을 extends가 아닌 :으로 표현
class MainActivity : AppCompatActivity() {

    //코틀린에서는 변수이름을 먼저 적은 후에 타입을 사용하고 NULL가능 여부를 ?으로 표현(여기서 Bundle은 자료형임)
    //함수를 선언할 때 fun이라는 키워드를 사용
    //함수의 return값이 없을 경우 void를 사용하지 않고 생략가능하다.
    //세미클론을 쓰지 않아도 된다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //레이아웃에 button1이라는 id로 선언된 뷰에 클릭이벤트 리스너를 등록
        //findViewById()함수를 사용하지 않아도 된다.
        button1.setOnClickListener{
            //버튼이 클릭되었을 떄의 코드 작성
            //Intent로 BmiJavaActivity를 타겟으로 지정하고 startActivity로 실행
            //Intent는 엑티비티 전환에 사용
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))

        }

        button2.setOnClickListener{
            //버튼이 클릭되었을 떄의 코드 작성
            //Intent로 BmiKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            //Intent는 엑티비티 전환에 사용
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))

        }

        button3.setOnClickListener{
            startActivity(Intent(this@MainActivity,VariableJavaActivity::class.java))
        }

        button4.setOnClickListener{
            startActivity(Intent(this@MainActivity,VariableKotlinActivity::class.java))
        }

        button5.setOnClickListener{
            startActivity(Intent(this@MainActivity,ControlJavaActivity::class.java))
        }

        button6.setOnClickListener{
            startActivity(Intent(this@MainActivity,ControlKotlinActivity::class.java))
        }

    }
}
