package chap15

fun main() {
    //繰り返し中のbreakとcontinue
    var i = 1
    while(true){
        println("1")
        ++i
    }
    //このコードは無限に続く
    //breakを入れることで、強制的に繰り返しを終わらせる
    i = 1
    while(true){
        println("1")
        ++i
        if(i == 10) break
    }
    //iが10になると繰り返しが止まる
    //breakが実行されたら、その下のコードを無視して止める

    //continueによる、繰り返しのスキップ
    while(i in 0..5){
        if(i % 3 ==0) continue
        println(i)
    }
    /**
    出力
    0
    1
    2
    4
    5
    */
    //条件が当てはまったらcontinueにより、その繰り返しは止まり、次の繰り返しに入る

    

}