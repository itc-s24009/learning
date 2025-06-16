package chap14

fun main(){
    //whileを使った繰り返し処理
    var i = 1
    while(i < 10){
        println(i)
        ++i
    }
    //条件が当てはまるまで繰り返す
    //順序は、条件の確認→当てはまるなら実行

    //一度実行して、条件を確認して、当てはまるなら繰り返す、という挙動のコード
    i = 1
    do{
        println(i)
        ++i
    }while(i < 10)

}