package chap19


fun main() {
    //過去にやった辞書のようなもの
    val a : Map<String,String> = mapOf("A" to "a", "B" to "b")

    // Aとaが紐付いている
    //indexのように、指定して出力できる
    //indexでは出力できない
    println(a["A"]) // a

    //追加、削除が可能なmap
    val b : MutableMap<String,String> = mutableMapOf("A" to "a", "B" to "b")
    //追加
    b.put("C" , "c")
    //削除
    b.remove("C")

    //存在しない値を出すと、nullが帰ってくる
    //nullのときに置き換えて出力する
    val c = b.getOrDefault("A","nullだよ") // A
    val d = b.getOrDefault("Z","nullだよ") // nullだよ

    

}