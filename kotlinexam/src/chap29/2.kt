package chap29

fun main() {
    //ポリモーフィズム（多様性）
    val a = Ferrari("赤")
    val b = Prius("赤")
    stopcar(a)
    stopcar(b)
}


//この1.ktは良い例
//同じような内容をまとめて実行できており、きれい
//クラスの継承元を型として扱うことで、その方を受け取ってまとめている
fun stopcar(x: Car){
    x.drive(5)
    println("止まったよー")
}

//この、stopcarという同じ関数を使っているのに
//実行される関数は違う。（上ではフェラーリ、下ではプリウス）
//このような同じ名前の関数だが、受け取るものによって別の動きをすることを
//オーバーロードという




open class Car(color:String){
    open fun drive(driving: Int) {
        println("${driving}km走るよー")
    }
}
class Ferrari(color: String): Car(color){
    override fun drive(driving: Int) {
        println("フェラーリが${driving}km走っちゃうよー！")
    }
}

class Prius(color: String): Car(color){
    override fun drive(driving: Int) {
        println("プリウスが${driving}km走っちゃうよー！")
    }
}