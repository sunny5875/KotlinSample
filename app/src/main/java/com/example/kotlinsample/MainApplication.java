package com.example.kotlinsample;

import android.app.Application;
import android.content.Context;
/*
* ToastUtilJava에서 Toast함수를 만들었을 때 getApplicationContext는
* activity에서만 사용할 수 있어 오류를 생기므로 고치기 위해 추가적으로 만든 클래스
* manifest에서 application name을 MainApplication으로 설정해줘야 이 클래스로 적용되어 돌아간다.
* */

//앱의 전역적으로 사용하는 상태 정보를 관리하는 기본 클래스
public class MainApplication extends Application {

    private static Context applicationContext;

    public static Context getAppContext(){
        return applicationContext;
    }


    //앱이 최초 실행될 때 호출된다.
    public void onCreate(){
        super.onCreate();
        applicationContext=getApplicationContext();
    }

}
