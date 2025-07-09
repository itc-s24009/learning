package chap39

import chap38.count

fun main() {
    //ラムダ式とは
    //関数オブジェクトのきれいな書き方
    //関数オブジェクトを省略せずに書いてみる
    //xに、(Int,Int)を受け取り、Intを出力する関数の型を指定し
    //(x:Int,y:Int)から、x+yを出力する関数を代入する
    val x : (Int,Int) -> Int =  fun(x:Int,y:Int) : Int{ return x + y}

    //ラムダ式を使うとこれだけ省略できる
    //なぜなら、yの型指定に合わせることで、わざわざ右側での型指定をしなくても良いから
    val y : (Int,Int) -> Int =  {x,y->x+y}


    //つまり、このように送るオブジェクト関数を書き換えることもできる
    //同じように、関数に受け取り先で型の指定をしているためである
    val z = cal({x,y->x+y})

    //右側で、->を使わずに、itを使う方法がある
    //itは、代入されているものが一つなので、ソレを引っ張ってきている
    val a : (Int) -> Int =  {it + 3}


}

fun cal(x:(Int,Int)-> Int): Int {
    val result = x(5,2)
    return result
}

