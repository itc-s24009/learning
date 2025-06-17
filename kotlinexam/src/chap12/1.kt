package chap12

fun main(){  
    //whenでの複数の条件分岐
    //条件を比較して、当てはまるものを実行する
    //同時に複数の条件を指定できる
    val x = 1
    val z = 2
    when(x){
        1 -> println("1")
        2,3 -> println("2,3")

        else -> println("それ以外")
    }
    //whenの後ろではなく、()を使い、いろんな条件式を使える(「||」なども使える)
    when{
        (x==1) -> println("1")
        (x==2 || z==3) -> println("2,3")
        else -> println("それ以外")
    }

    //{}で囲み、複数のコードを実行
    when(x){
        1 -> {
            println("1")
            println("いち")
        }
        else -> println("それ以外")
    }

    //変数にwhenを代入
    val y = when(x){
            1 -> "1"
            else -> "それ以外"
        }
    println(y)


}