package chap18


fun main() {
    //セット
    val a : Set<String> = setOf("a","b","c")
    val b : MutableSet<String> = mutableSetOf("a","b","c")
    //基本、リストや配列のように使える

    //リストでも使える、データを含んでいるかのチェック
    // Boolean型
    val c = a.contains("a")

    //リストでも使える、データ内の個数チェック
    val d = a.count()

    //リストとセットで挙動が変わる
    //セットは重複を無視する

    val e = setOf("a","a","a")
    val f = listOf("a","a","a")
    println(e.count()) // 1  list
    println(f.count()) // 3  set

    
}