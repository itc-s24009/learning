package chap24

fun main() {
    val a = Person()
    a.name = "たけし" // 実は見えないsetメソッドが実行されている
    val b = a.name // 実は見えないgetメソッドが実行されている


    //下にあるように、ageのset,getメソッドにはコードが追加されている
    //そのコードも実行される
    a.age = 20
    val c = a.age
}

class Person(){
    var name = "name"
        //目に見えるようにすると、get,setメソッドはこんな感じ
        //変数のにつける
        get(){
            return field // fieldはここでいうとnameと同じ扱い
        }
        set(x) {
            field = x // 受け取ったxをfieldに入れる
        }

    //get,set関数を表記することで
    //a.name = "たけし"
    //val b = a.name
    //のような挙動に、追加でコードを入れることができる
    var age = 0
        get(){
            println("get関数を使ったよ")
            return field
        }
        set(y) {
            println("set関数を使ったよ")
            field = y
        }

    //変数にget関数をつけることで、getするごとに、内容を更新できる
    val message:String
        get(){
            return "${name}だよ"
        }

    
    fun greet(){
        println("Hello")
    }
}