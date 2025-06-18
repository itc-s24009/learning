package chap35

import kotlin.math.PI

fun main() {
    val a = Persons("aa")
    val b = Persons("aa")
    println(a.toString())
    println(b.toString())
    if(a == b ){
        println("一緒だよ")//出力されない
    }else{
        println("一緒じゃないよ")//出力される
    }

}
//効率のいい方法が、クラスに「data」をつけること。これがデータクラス
//それにより、aを文字列に変換した結果が
// ハッシュコードを無視した、格納されたデータをもとにした人間にもわかる、かんたんな文字列になる
//そのおかげで、a==bが、ハッシュコードを無視して、内容で比較することができる
data class Persons(val name:String){
}