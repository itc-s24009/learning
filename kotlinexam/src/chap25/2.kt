package chap25

fun main() {
    val a = Persons("たけし",10)
}
//インスタンス化のときに送られる変数を受け取る準備が必要
//何も送られなかったとき用の、デフォルトも決めておくことができる
class Persons(var name:String = "no name",var age:Int = 0,var money:Int = 10000){
    //インスタンス化したときに、実行されるようにする。イニシャライザブロック
    init {
        println("インスタンス化されたよ！")
    }
}