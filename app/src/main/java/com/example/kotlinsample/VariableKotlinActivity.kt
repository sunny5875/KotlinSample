package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    //var 또는 val 둘 다 사용가능
    /*
    val : 변경 불가능한 참조를 저장하는 변수로써 value를 의미, final과 똑같은 의미
    var : 변경 가능한 참조, variable을 의미, 일반적인 변수를 의미
     */

    var clickCount=0
    //var ClickCount:Int=0 <-처럼 변수의 타입을 직접 명시할 수도 있다.
    val startTime=System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)
        //시작시간을 텍스트 형태로 변환
        val timeText=SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        //시작시간을 textView에 보여줌
        startTimeLabel.text="Activity 시작시간 : ${timeText}"

        clickCountLabel.text="버튼이 클릭된 횟수 : ${clickCount}"

        button.setOnClickListener{
            clickCount+=1
            clickCountLabel.text="버튼이 클릭된 횟수 : ${clickCount}"
        }

    }
}
