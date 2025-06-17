package chap21


fun main() {
    val a = plus(1,2)
}
//関数に複数の数字を送ることができる
//また、別のコードも入れることができる
fun plus(x:Int, y:Int):Int {
    println("${x}と${y}の合計")
    return x + y
}