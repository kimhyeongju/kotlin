package basic

fun loopExample(){
    // 반복문 for: in과 (시작..끝)으로 반복가능
    for(i in (0..10)){
        println("i -> " + i)
    }

    // 반복문 while: while(조건){}
    var i : Int = 0;
    while(i < 10){
        i++; println("$i 입니다.")
    }
}

fun main(args : Array<String>){
    loopExample()
    
}