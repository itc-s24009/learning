package chap38

fun main() {
    //xの中に、num=0が保存されており
    //実行するたびに+1されるシステムが作動し、それも保存されるため
    //xは、numの変数を保存して実行することができる
    val x = count()
    println(x())
    println(x())
    println(x())
}

fun count() : () -> Int{
    var num = 0
    val c: () -> Int = fun() : Int {
        num++
        return num
    }
    return c
}