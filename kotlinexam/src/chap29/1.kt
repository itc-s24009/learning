package chap29

fun main() {
    //ポリモーフィズム（多様性）
    val a = Ferrari("赤")
    val b = Prius("赤")
    stopferraris(a)
    stoppriuss(b)
}


//この1.ktは悪い例
//同じような内容なのに、クラスが違うだけでわざわざ分けて作っており、長ったらしい
fun stopferraris(a: Ferrari){
    println("止まったよー")
}
fun stoppriuss(a: Prius){
    println("止まったよー")

}
//そこで、2.ktを見てほしい




open class Cars(color:String){
    open fun drive(driving: Int) {
        println("${driving}km走るよー")
    }
}
class Ferraris(color: String): Car(color){
    override fun drive(driving: Int) {
        println("フェラーリが${driving}km走っちゃうよー！")
    }
}

class Priuss(color: String): Car(color){
    override fun drive(driving: Int) {
        println("プリウスが${driving}km走っちゃうよー！")
    }
}