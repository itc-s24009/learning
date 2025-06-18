package chap33

fun main() {
    //Anyクラス
    //すべてのクラスは、Anyクラスが継承元となっており
    //Anyクラスはすべてのクラスの基盤である

    //例えば、普段普通に使っているtoStringやlength、equal関数は
    //すべてAny関数が持っており、それらを実行していた


}

//本来の書き方
//普段は省略されているが、Anyクラスを継承している
open class Car():Any(){

}