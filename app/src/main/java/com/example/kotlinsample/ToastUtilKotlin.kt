package com.example.kotlinsample

import android.widget.Toast

//코틀린은 함수가 클래스 없이 그냥 존재해도 된다.
//최상위 함수는 사실 클래스가 없는 상태는 아니다 자동으로 새로운 클래스에 포함된다.
//예를 들어 ToastUtilKotlin은 ToastUtilKorlinKT 클래스가 되는 식이다.

    fun toastShort(message: String) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
    }


    fun toastLong(message: String) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show()
    }
