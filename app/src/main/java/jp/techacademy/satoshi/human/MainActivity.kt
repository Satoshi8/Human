package jp.techacademy.satoshi.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("サトシ",22)
        human.say()
        Log.d("kotlintest","私の名前は" + human.name + "です。")
        Log.d("kotlintest","年は" + human.age + "です。")


    }
}
