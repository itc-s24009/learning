package chap38

fun main() {
    //スコープについて
    var x = "san"
    val p1 :(String) -> String = fun (name : String) = name + x

    x = "tyann"
    val p2 :(String) -> String = fun (name : String) = name + x
    //表記的には、p1ではsan、p2ではtyanが使えそうですが
    //実際はどちらもtyanになってしまう
    //理由はsanからtyanに更新したとき、xは定義された範囲内の一番内側にいるため
    //xが更新されてしまうことが原因
    println(p1("takesi"))
    println(p2("yumi"))
}