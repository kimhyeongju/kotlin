
// lambda 함수의 리턴
var lambdaRetrun = Exit@{
    if(true){
        return@Exit 3
    }
    1000
}


fun main(args: Array<String>) {
    println(lambdaRetrun())
}