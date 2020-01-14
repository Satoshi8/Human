package jp.techacademy.satoshi.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("サトシ",22 )
        human.say()
        Log.d("kotlintest", "私の名前は"+ this.name + "です。" + "年は"+this.age + "歳です。" )
        val human2 = Human("料理" )
        human.think()
        Log.d("kotlintest","私は"+ this.hobby + "について考える。" )
    }
}
