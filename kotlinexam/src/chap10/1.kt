package chap10

fun main(){
    // 範囲指定 IntRange型
    val x : IntRange = 0..10
    plintln(x)
    // xには「０から１０」という範囲が入っている

    //条件式での使用
    val t = 5 in x
    //　5がxの範囲内に入っているかどうかのboolean型

    //文字の範囲
    val y = 'a'..'d' // 「a」から「d」
    val z = 'あ'..'こ' // 「あ」から「こ」

    
}