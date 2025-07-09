package chap37

fun main() {
    //変数に関数を直接入れる
    //様々な書き方がある
    val p1 = fun(a: Int, b: Int) = a + b
    val p2 = fun(a: Int, b: Int) : Int = a + b
    val p3 : (Int,Int) -> Int = fun(a: Int, b: Int) : Int = a + b
    cal(p1)
}

fun cat(cats: (Int,Int) -> Int){

    println(cats(5,8))
}