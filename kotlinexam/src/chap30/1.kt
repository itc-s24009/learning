package chap30

fun main() {
    //抽象クラス
    val a = Ferrari("赤")
    val b = Prius("赤")

}

//このように、オーバーロード、オーバーライドを前提とした
//クラスとして実際に使うわけではない（使うことができない）
//テンプレートとして用意するクラスを
//抽象クラスという
//absrtactをつける
abstract class Cars(color:String){
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