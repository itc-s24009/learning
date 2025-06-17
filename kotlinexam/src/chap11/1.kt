package chap11

fun main(){
    // ifを使った条件分岐
    var a = 2
    var b = 2
    if (a==b){
        println("等しい")
    }
    
    //変数に条件式を入れて活用
    val c = (a==b)
    if(c){
        println("等しい")
    }

    //条件式の種類
    /**
    ==  等しい
    >、<　超過や未満
    >=,<= 以上や以下
    != 等しくない
    a in b bの中にaが含まれているか
    */

    //elseでの、条件に合わない場合の処理
    b = 3 // 等しくなくさせる
        if (a==b){
        println("等しい")
    }else{
        println("等しくない")
    }

     // else if による条件の追加
             if (a==b){
        println("等しい")
    }else if (b>a){
        println("bのほうが大きい")
    }else{
        println("等しくない")
    }

    // 上から順に比較していき、最初のtrueのみ実行する

    //変数にif文を入れて活用

    val d = if (a==b){
        println("コードの実行")
        "等しい"
    }else{
        println("コードの実行")
        "等しくない"
    }
    println(d)

    //if文の入った変数を出力すると、中のコードが実行されたあと、実行された部分の最後の文字列が代入され、出力される。
    
     
}