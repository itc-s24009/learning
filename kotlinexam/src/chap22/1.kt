package chap22


fun main() {
    //エラーが出ても、そのエラーを受け取って出力する

    val a = "a"
    //val b = a.toInt()  stringをintにするとエラーを吐く
    //エラー名はNumberFormatException

    //tryの中を実行し、エラーが出たら、
    // (e:エラー名)に当てはまるエラーなら、catchの中を実行する
    // finallyは、何が起きても絶対に実行する
    try{
        val b = a.toInt() // NumberFormatExceptionエラー
    }catch (e: NumberFormatException){
        println("数字のエラーだよ")
    }catch (e: Exception){//Exceptionは、すべてのエラーに当てはまる
        println("なにかのエラーだよ")
        // throw e   finallyのあとに、改めてエラーを吐かせる
    }finally {
        println("実行したよ")
    }


}