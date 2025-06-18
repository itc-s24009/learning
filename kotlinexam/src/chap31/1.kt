package chap31

fun main() {
    //インターフェース
    //一つのクラスを継承元として、たくさんの継承先を作ることはできる
    //しかし、複数の継承元から継承先を作ることはできない
    //そのため
    //「複数の継承先で、似たような機能があったら、継承元でまとめる」はできるが
    //「複数のクラスで、似たような機能があったら、継承先でまとめる」はできない

    val a = FlyPerson()
    val b = FlyCar()
    //このように、
    //aの中のPersonの中のfly関数
    //bの中のCaeの中のfly関数
    //が引き出されており、どこかまとまりがない
    a.fly()
    b.fly()
}
open class Persons()
open class Cars()

//このように、それぞれ継承先で作ると、同じ機能、名前の関数が２つある
//それらをまとめるためにインターフェースを使う
//2.ktに続く
class FlyPerson(): Person(){
    fun fly(){
        println("人が空を飛んでる！")
    }
}
class FlyCar(): Cars(){
    fun fly(){
        println("車が空を飛んでる！")
    }
}
