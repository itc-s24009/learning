package chap17


fun main() {
    //リスト
    // 型は、List<変数名>
    //変数の部分は省略できる
    val a : List<Int> = listOf(1,2,3)
    val b = listOf(4,5,6)
    //基本的な使い方は配列と変わらない

    //置き換えができない
    //a[0] = 2 エラー発生

    //本来、リストも配列も中の個数は増やせない
    //増やすことのできるリスト

    //追加
    val c : MutableList<Int> = mutableListOf(7,8,9)
    c.add(10)
    for(i in c){
        println(i) // 7 8 9 10
    }

    //index指定の削除
    c.removeAt(3)
    for(i in c){
        println(i) // 7 8 9
    }

    //内容指定の削除
    c.remove(9)
    for(i in c){
        println(i) // 7 8
    }


}