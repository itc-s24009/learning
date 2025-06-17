package chap27

fun main() {
    // クラスの継承
    val a = Ferrari("赤")
    a.drive(5)
}
//Carクラスは、openをつける（説明は後ほど）
//下にあるFerrariクラスの基礎クラスである
open class Car(color:String){
    open fun drive(driving: Int) {
        println("${driving}km走るよー")
    }
}
//このFerrariクラスは、Carクラスを継承している
//Carクラスの内容を使うことができる
class Ferrari(color: String): Car(color){

}