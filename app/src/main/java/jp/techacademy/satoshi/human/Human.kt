package jp.techacademy.satoshi.human

import android.util.Log

open class Human:Animal,Thinkable {


    constructor(name:String, age: Int, hobby: String): super(name,age,hobby){
        var hobby = ""
    }
   override fun say(){
        Log.d("kotlintest", "私の名前は"+ this.name + "です。" + "年は"+this.age + "です。" )
   }

    override  fun think(){
        Log.d("kotlintest","私は"+ this.hobby + "について考える。" )
    }
}
