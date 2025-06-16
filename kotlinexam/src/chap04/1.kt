package chap04

fun main() {
    //　変数の型の種類(数字系)
    //　整数
    val a: Byte = 100
    val b: Short = 10000
    val c: Int = 1000000000
    //　Long型には末尾にL
    val d: Long = 1000000000000000000L

    //  アンダーバー「_」を無視する
    //　わかりにくい桁数の数字も、自由に区切れる
    val k: Int = 1_000_000_000


    //　少数
    //　Float型には末尾にf
    val e: Float = 0.123f
    val f: Double = 0.123456789

    //　U + 整数型
    //　末尾にU
    //　負の数が使えない
    val g: UByte = 200u
    val h: UShort = 40000u
    val i: UInt = 3000000000u
    val j: ULong = 10000000000000000000u
}