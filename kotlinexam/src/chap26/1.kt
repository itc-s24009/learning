package chap26

fun main() {
    val a = Person(10)
    println(a.name) // セカンダリコンストラクタにより、通常はno name
                    // age<18なら、未成年くん
    println(a.age)
    println(a.money)

}
class Person(var name:String,var age:Int,var money:Int){
    //コンストラクタには、最初に決めるプライマリコンストラクタ（上のやつ）と
    //セカンダリコンストラクタ（下のやつ）がある
    //セカンダリとついているが、プライマリよりさきに実行される

    //もしも送られたコンストラクタがプライマリコンストラクタとずれていたときに使える
    constructor(name: String) : this(name, 20,10000){
        println("セカンダリコンストラクタを使ったよ")
    }
    //送られたコンストラクタが、ageのみなら、プライマリコンストラクタにthis()の中身を送る

    //セカンダリコンストラクタと当てはまっていれば
    //送られたコンストラクタをもとに
    //デフォルト値をいじることができる
    constructor(age: Int) : this( "no name", age,age*10){
        if(age < 18){
            name = "未成年くん"
        }
    }

}