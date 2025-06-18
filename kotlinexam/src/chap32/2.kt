package chap32

fun main() {
    val a : String? = "aa"

    // 「!!」をつけることで、変数を強制的に非null許容型に変換する
    //これで、準備できていないメソッドにもかんたんに使うことができる
    println(lengths(a!!)) // 2

    //しかし、非null許容型にした変数に
    //すでにnullが入っていた場合
    val b : String? = null
    // println(lengths(b!!)) nullのエラーが出てしまう
    //基本的に、nullのエラーにはnullチェックなどを使えば防ぐことができる
    //「!!」は、あくまで知識として覚えておこう

}

fun lengths(x: String):Int{
    return x.length
}

// nullチェックの省略
//nullだったときに、別のなにかに置き換えるエルビス関数
fun lengthnull1(x: String?):Int{
    //受け取り型は、null許容型で実行し
    //「もしnullだったら」を完結に書くことができる
    //これだと、xがnullなら0を返すようになっている
    return x?.length ?: 0
}

//nullだったときに、無視する関数
//例として、null許容型のリストを使う
val lists : List<String?> = listOf("a","b","c",null)

//let関数により、nullじゃなければ{}の中のコードを実行する
//nullなら、何も実行しない
fun lengthnull2(x: List<String?>){
    for(i in x){
        i.let {println(it)}
    }
}