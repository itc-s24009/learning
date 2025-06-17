package chap21


fun main() {
    val a = pluses(1,2)
}
//returnを使わず、中身を実行するだけの関数
//返す型を書かない。
fun pluses(x:Int, y:Int){
    println("${x}と${y}の合計")
    println("${x+y}")
}
