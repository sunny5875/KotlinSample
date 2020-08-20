package com.example.kotlinsample
//코틀린은 기본적으로 getter와 setter를 제공(단, var은 getter와 setter가 제공되고 val은 getter만 제공된다.)
class Person{
    var age: Int=0
    val name:String

    constructor(name:String){
        this.name=name
    }

 /*
    get과 set을 마음대로 바꾸고 싶다면 get()과 set(value)해서 다시 적어주면 된다.
 */

}