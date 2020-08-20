package com.example.kotlinsample;

import android.widget.Toast;

import static com.example.kotlinsample.MainApplication.getAppContext;

public class ToastUtilJava {

    public static void toastShort(String message){
        Toast.makeText(MainApplication.getAppContext(),message,Toast.LENGTH_SHORT).show();

    }


    public static void toastLong(String message){
        Toast.makeText(MainApplication.getAppContext(),message,Toast.LENGTH_LONG).show();

    }
}
