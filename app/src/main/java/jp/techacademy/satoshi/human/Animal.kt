package jp.techacademy.satoshi.human



abstract class Animal{

    var name = String
    var age = Int


    constructor(name: String, age: Int){
        var name :String = ""
        var age :Int = 0

    }
    abstract fun say()

}