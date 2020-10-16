package basic

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
    // java와 다르게 try catch를 강제적으로 할 필요없음
    // 만드는 것은 개발자 선택

    try{
        13 / 0
    } catch(e: Exception){
        println(e)
    } finally{
        println("마지막 수행")
    }

    var zerodivided = 13 / 0;
    println(zerodivided)
}