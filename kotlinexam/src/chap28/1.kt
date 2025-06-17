package chap28

fun main() {
    // メソッドのオーバーライド
    val a = Ferrari("赤")
    a.drive(5)
    //下で、オーバーライドの上書きにより、出力は
    //フェラーリが5km走っちゃうよー！
}
//オーバーライドによる上書きのためのopen
open class Car(color:String){
    open fun drive(driving: Int) {
        println("${driving}km走るよー")
    }
}
//Carクラスのdriveメソッドを、上書きすることができる。オーバーライド
class Ferrari(color: String): Car(color){
    override fun drive(driving: Int) {
        println("フェラーリが${driving}km走っちゃうよー！")
    }
}