package basic

fun main(args: Array<String>) {
    // 읽기전용 - list. 아무 데이터형
    val lst = listOf(1,"이", 3.00f, true)
    for(i in 0..lst.size -1){
        println(lst.get(i).toString())
    }

    // 수정가능 - list. 정한 데이터형
    println("__________")
    var lstEditable = mutableListOf<String>()

    // add 메소드로 추가
    lstEditable.add("universe...")
    lstEditable.add("Jai")
    lstEditable.add("guru")
    lstEditable.add("deva")
    lstEditable.add("Om")

    for(s in lstEditable){
        println(s)
    }

    println("__________")

    // remove 메소드로 삭제
    lstEditable.removeAt(0);
    for(s in lstEditable){
        println(s)
    }

    println("__________")
    var m =hashMapOf("고양이" to 1, "강아지" to 2)
    println(m["강아지"])
}