package chap21


fun main() {
    //関数について
    //関数は、かんたんに言うと「いろんなことをまとめて実行してくれるもの」
    //下にあるplus関数に、1を代入したものを、aに代入
    //plus関数が実行され、その結果がaに返ってくる
    val a : Int = plus(3)
    println(a) //5
}
//fun 関数名(受け取る変数名:受け取る型):返す型{
//    return 返す内容
//}
fun plus(x:Int):Int {
    return x + 2
}
// 一行にまとめることができる
fun minus(x:Int):Int = x - 2
fun xx(x:Int):Int = x * 2