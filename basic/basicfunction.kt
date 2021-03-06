package basic

// fun 함수명(변수명 : 데이터타입, ...) : 리턴값 { return; }
fun funByReturn(s: String): Any? {
    return s + "-를 입력받았습니다."
}

fun funByParameter(i: Int, s: String) {
    println(i.toString() + s)
}

fun funByInline(i: Int, i1: Int) = i * i1

fun funByNoParam() {
    println("매개변수 없어요")
}

// 함수를 정의한 변수
val funcVariable = { s : String -> println (s)} // lambda함수
var funVarByType : (String) -> Any? = :: funByReturn

fun main(args : Array<String>){
    funByNoParam()
    funByParameter(3,"숫자입니다")
    println(funByReturn("3을 넘기니"))
    println(funByInline(3,10))

    funcVariable("함수형 변수 1")
    println( funVarByType("함수형 변수 2"))
}