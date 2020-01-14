package jp.techacademy.satoshi.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("サトシ", 22, "料理")
        human.say()
        human.think()

        val human2 = Human("サトシ",22,"料理")
        human2.say()
        human2.think()


    }
}