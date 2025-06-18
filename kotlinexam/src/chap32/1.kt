package chap32

fun main() {
    //null許容型について
    //何かを受け取ろうとしたときに、空だった、というエラー
    //NullPointerException

    val a : String
    // a = null 実行するとエラーが発生する

    //nullをnullとして受け取り、nullとして扱う方法がある
    //型を決めるときに、「?」を後ろにつける
    val b : String?
    b = null //エラーが出ない

    //nullによる出力は基本null
    //出力結果がnullになるときは、変数の後ろにも「?」をつける
    println(b?.length) // null

    val c : String? = "aaa"

    //null許容型を、非null許容型を受け取るメソッドに送ることはできない
    //val d = length(c) エラーを吐く

    //また、非null許容型を受け取るメソッドでも
    //nullを受け取る準備（nullチェック）や、型をすべてnull許容型にするなど、準備ができてないと、メソッド側が実行できない
    //しかし、nullを受け取る準備さえ出来ていれば大丈夫
    val e = nulllength(c)// 出力をすべてnull許容型にしている
    val f = nulliflength(c) //if文によるnullチェックを挟んでいる

    //しかし全てめんどくさい
    //そこで2.ktを見てみる
}

//非null許容型を受け取るメソッド
fun length(x: String):Int{
    return x.length
}
//型を非null許容型に揃えたメソッド
fun nulllength(x: String?):Int?{
    return x?.length
}

//もしもnullが入っていたら、というif文（nullチェック）による
//nullを受け取る準備ができているメソッド
//null許容型を受け取り、非null許容型を返すメソッド
fun nulliflength(x: String?):Int {
    if (x != null) {
        return x.length
    } else{
        return 0
    }
}