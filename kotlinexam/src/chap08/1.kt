 package chap08

fun main(){
    //型の変換
    val a : Byte = 1

    val b = a.toInt()
    //bは、Byte型のaをIntにして受け取った


    val int = 10000

    val byte = int.toByte()
    println(byte) // 10000は出てこない
    // 数字の型には入る数字に上限がある
    //　それを超えると、「桁あふれ」により、おかしくなる

    // 文字型の数字を数字型にする
    val string1 = "100"
    val int1 = string1.toInt()
    println(int1)

    val string = "string"
    val int2 = string.toInt()
    println(int2) // エラーが出ます
    //　数字ではない文字を数字型にはできない


}