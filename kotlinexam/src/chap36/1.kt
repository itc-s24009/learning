package chap36

fun main() {
    // スコープとは
    val p = Person()
    p.greet() //スコープが使われる、takesi
    p.SetNameAndAge("yui",1)
}
class Person(){
    var name = "name" //クラス内で使える関数、プロパティ関数
    var age = 0

    fun greet() {
        val name = "takesi" //{}で定義された中で使う関数、ローカル関数
        val age = 20        //その定義された範囲をスコープという
        println("${name}: ${age}")//一番内側のスコープを優先して扱う
    }

    fun SetNameAndAge(name: String, age: Int) { //ちょっと便利なセッターの作り方
        this.name = name //this.nameやthis.ageは、プロパティ変数を指す
        this.age = age //スコープとの重複などを無視してプロパティ変数を変えれる
    }
}