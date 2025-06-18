package chap31

fun main() {

    val a = FlyPersons()
    val b = FlyCars()
    val c = FlyBike()

    //flying関数では、Flyallクラスを受け取る準備をしている
    //送っているクラスは、Flyallを引用しているかつ
    //それぞれオーバーライドしているため
    //クラスにあった結果が実行される
    flying(a) //人が空を飛んでる！
    flying(b) //車が空を飛んでる！
    flying(c) //なにか飛んでる！

    //このように、同じメソッドを使って
    //別々のクラスにある同じ機能を
    //まとめることができる
}
open class Person()
open class Car()
open class Bike()

//インターフェース、flyall
interface Flyall{
    fun fly(){
        println("なにか飛んでる！") // オーバーライドがないときのデフォルト値
    }
}

fun flying(x : Flyall){ // インターフェースを実行する関数
    //受け取ったクラスの型は、Flyallを引用してるため、Flyall型として受け取ることができ
    //このようにfly関数が使える
    x.fly()
}


//インターフェースFlyallを引用するために
//継承元の後ろにFlyallをつけて
//Flyallにあるfly関数にオーバーライドするため
//overrideをつける

class FlyPersons(): Person(), Flyall{
    override fun fly(){
        println("人が空を飛んでる！")
    }
}
class FlyCars(): Car(),Flyall{
    override fun fly(){
        println("車が空を飛んでる！")
    }
}

//fly関数を持っていないため、flyが実行されたらインターフェースのデフォルトを実行する
class FlyBike(): Bike(), Flyall{
}
