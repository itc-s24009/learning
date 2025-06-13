 package chap05

fun main(){
    //　変数の型の種類(文字系)
    //　Char、一文字だけ代入、「''」で囲む
    val a : Char = 'a'

    //　String。 複数文字を代入、「""」で囲む
    val b : String = "aaaa"

    //  改行を意味する「\n」
    val c : String = "aa\naa"
    println(c)

    //  変数を「""」に入れて出力
    println("aa${b}")

    //　数字だったとき、計算式としても使える
    val d = 2
    println("2+2=${d*2}")

    // 長文の改行をわかりやすく表現する
    // """
    //　|内容１
    //　|内容２
    //  """.trimMargin()
    val e = """
    |xx
    |xxxzc
    """.trimMargin()
    println(e)
}