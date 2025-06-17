package chap16


fun main() {
    //配列
    //数字型は変数名+ArrayOf
    //文字はArrayOf
    val a : IntArray = intArrayOf(1,2,3,4,5)
    println(a[0])

    // 置き換え
    a[0] = 2

    // inを使って繰り返しができる
    for(i in a){
        println(i)
    }

    // indexを活用する
    // withIndexで、indexを出すことができる
    for((index,i)in a.withIndex()){
        println("${i} + ${index}")
    }


}