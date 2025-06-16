 package chap07

fun main(){
    //　Booleanの論理演算

    val t1 = true
    val t2 = true
    val f1 = false
    val f2 = false


    //　すべてtrueである。「&&」
    println(t1 && t2) // true
    println(t1 && f1) // false
    println(f1 && f2) // false

    //　どれかがtrueである。「||」
    println(t1 || t2) // true
    println(t1 || f1) // true
    println(f1 || f2) // false

    // 式の活用
    val x = 10
    val y = 20
    println(x == 10 && y == 20) // true、すべて正しい
    println(x == 10 && y == 30) // false、正しくないものがある
    println(x == 10 || y == 30) // true、どれかが正しい
    println(x == 20 || y == 30) // false、すべて違う

    // 反対の意味、「!」
    val t3 = true
    val f3 = !t3 // trueの反対を代入
    println(f3) // false
}