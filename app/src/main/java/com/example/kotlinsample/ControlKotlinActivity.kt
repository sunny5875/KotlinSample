package com.example.kotlinsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_control.*

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)

        button.setOnClickListener {
            var number = numberField.text.toString().toInt()

            /*if (number % 2 == 0) {
                Toast.makeText(applicationContext, "\'$number\'는 2의 배수입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (number % 3 == 0) {
                Toast.makeText(applicationContext, "\'$number\'는 3의 배수입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(applicationContext, "\'" + number + "\'", Toast.LENGTH_SHORT).show()
            }*/
            //if else 조건문을 when으로 바꿔서 사용할 수도 있다.
            when{
                //number%2==0->Toast.makeText(applicationContext, "\'$number\'는 2의 배수입니다.", Toast.LENGTH_SHORT).show()
                number%2==0-> toastShort("\'$number\'는 2의 배수입니다.")
                number%3==0->Toast.makeText(applicationContext, "\'$number\'는 2의 배수입니다.", Toast.LENGTH_SHORT).show()
                else->Toast.makeText(applicationContext, "\'$number\'는 2의 배수입니다.", Toast.LENGTH_SHORT).show()

            }



           //switch 대신 when를 사용, break가 필요하지 않으며 case는 ->로 표현
            //만약 여러 케이스를 넣고 싶다면
                // in 1..4->button.text="실행-1~4"

           when (number) {
                4 -> button.text = "실행-4"
                9 -> button.text = "실행-9"
                else -> button.text = "실행"
            }
            /*
            <kotlin에서의 for문>
                for(item in collection}{}

                -kotlin에서는 dowhile문에서 do블럭에 내부변수에 접근 가능하다.
                -kotlin은 레이블을 지원(break가 적용되는 loop를 정확하게 만들어줌)
             ex)
             loop1@ while(true){
                var x= reteieveData()
                if(x==null) break@loop1
                else{
                loop2@while(true){
                    var y= getData()
                    if(y==null) break@loop2
                    }
                }
             }
            */

            /*
            * kotlin에서의 함수
            선언에서는 public void 이런거 안쓰고 fun만 쓰면 된다.
            parameter쓸 때 타입은 나중에 써야 한다. <-   x:int 이렇게
            반환값이 있을 경우에는 선언 끝에 :으로 표시한다 <-  fun function(age:x):int{} 이렇게
            void는 생략 가능

            */




        }
    }
}
