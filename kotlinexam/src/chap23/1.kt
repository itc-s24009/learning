package chap23

fun main() {
    //クラスの作り方、インスタンス化
    val a = Person()
    //クラス内の変数の出力や変更
    a.name = "たけし"
    println(a.name)
    //クラス内のメソッドの実行
    a.greet()
}

class Person(){
    //クラスで使える変数、プロパティ変数、var
    var name = "name"
    var age = 0
    //クラスに入ってる関数、メソッド
    fun greet(){
        println("Hello")
    }
}