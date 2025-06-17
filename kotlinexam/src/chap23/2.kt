package chap23

import jdk.internal.joptsimple.internal.Messages.message

fun main() {
    //クラスは色んな種類作れる
    val a = Persons()
    val b = Persons()
    val c = Persons()
    //クラスは同じだが、内容は分けられている
    a.name = "たけし"
    b.name = "ゆい"
    println(a.name)
    println(b.name)
}

class Persons(){
    //クラスで使える変数、プロパティ変数
    var name = "name"
    var age = 0
    //クラスに入ってる関数、メソッド
    fun greet(){
        println("Hello")
    }
}