package chap21


fun main() {
    //関数について
    //関数は、かんたんに言うと「いろんなことをまとめて実行してくれるもの」
    //下にあるplus関数に、1を代入したものを、aに代入
    //plus関数が実行され、その結果がaに返ってくる
    val a = plus(1)
    println(a) //2
}
//fun 関数名(受け取る変数名:受け取る型):返す型{
//    return 返す内容
//}
fun plus(x:Int):Int {
    return x + 1
}