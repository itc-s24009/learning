 package chap06

fun main(){
    //　真偽の型　Boolean
    val a : Boolean = true
    val b = false
    //ture（正しい） false（間違っている）の２種類

    //　出力は文字として出る
    println(a)

    //　条件式の結果からも出力できる
    val x = 10
    val y = x == 10 // 正しい
    val z = x == 12 // 間違っている
    println(y) // true
    println(z) // false

    val zza = x > 5 // 正しい
    val zzb = x > 20 // 間違っている
    println(zza) // true
    println(zzb) // false

    //反対の意味、「!」

    val l = 10
    val m = l != 10 // 間違っている
    val n = l != 5 // 正しい
    println(m) // false
    println(n) // ftrue
}