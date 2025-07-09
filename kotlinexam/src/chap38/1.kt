package chap38

fun main() {
    //クロージャ
    //関数オブジェクトを返すシステムを使った
    //関数オブジェクトを保存し続ける方法
    //これを使うことで、作った関数オブジェクトを使い続けることができる


    //xに、「san」が入ったオブジェクト関数を保存する
    val x = gettext("san")

    //「san」が入ったオブジェクト関数に、「takesi」を代入して実行する
    //xには、sanが入ったオブジェクト関数が代入されてるので
    //sanが入った関数を自由に実行できる
    val name = x("takesi")
    println(name)
}
fun gettext(str: String): (String)->String{
    //受け取った文字を保存し、保存した状態の関数オブジェクトを返す
    val cal:(String)->String = fun(name: String): String = name + str
    return cal
}