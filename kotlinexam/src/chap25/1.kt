package chap25

fun main() {
    //プロパティを、インスタンス化のときにまとめて決めることができる
    //基本的に受け取る側の順番に合わせなければいけない
    val a = Person("たけし",10)

    // 指定することで、順番を無視できる
    val b = Person(age = 20, name = "ゆい")

    //下で決めたデフォルトの確認
    println(a.name) // 送った「たけし」
    println(a.age) // 送った「10」
    println(a.money) //送ってないので、デフォルトの「10000」

}
//インスタンス化のときに送られる変数を受け取る準備が必要、コンストラクタ
//何も送られなかったとき用の、デフォルトも決めておくことができる
class Person(var name:String = "no name",var age:Int = 0,var money:Int = 10000){
    fun greet(){
        println("Hello")
    }
}