package chap21


fun main() {
    val a = plus(1,2)
    //関数に遅れる個数が決まっていない
    val b = plus(1,2,5,7)
}
//関数側が受け取る数を決めない。
fun plus(vararg numbers:Int) {
    for(number in numbers){
        println(number)
    }
}
