package jp.techacademy.satoshi.human

import android.util.Log

class Human:Animal,Thinkable {

    var name: String
    var age: Int
    var hobby: String


    constructor(){
    this.name = ""
    this.age = 0
    }
   override fun say(){
        Log.d("kotlintest", this.name + "("  + this.age + "歳)" )

    }
}
