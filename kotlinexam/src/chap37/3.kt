package chap37

fun main() {
    //このように、説明書をうまく使うこともできる
    //説明書を受け取る変数
    //("+")で、説明書を選択
    val c1 = getcal("+")
    //送られた説明書が実行できる形なので
    //そのまま実行する
    println(c1(2,5))
}

//(type: String)で、変数を受取、(Int,Int) -> Int を出力する
fun getcal(type: String): (Int,Int) -> Int{
    //関数を用意しておく
    val p = fun(a: Int, b: Int) = a + b
    val m = fun(a: Int, b: Int) = a - b
    //受け取った文字で関数（説明書）を選択する
    val x = when(type){
        "+" -> p
        else -> m
    }
    //returnで説明書を実行できる形で返す
    return  x
}