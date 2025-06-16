package chap13

fun main(){
    //forを使った繰り返し
    //iにそれぞれ0から10を入れて実行を繰り返す
    for(i in 0..10){
        println(i)
    }
    
    //stepを使い、繰り返しを飛ばし飛ばし行う
    for(i in 0..10　step 2){
        println(i)
    }
    //出力は0,2,4,6,8,10と、２つ飛ばしで行われる

    //downToを使い、範囲を逆から行う。10..0という表現は使えない
    for(i in 10 downTo 0){
        println(i)
    }

    
}