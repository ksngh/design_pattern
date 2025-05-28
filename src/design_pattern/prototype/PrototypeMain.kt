package design_pattern.prototype

fun main(){
    val original = Person("홍길동", 30, listOf("독서","프로그래밍"))

    val copy = original.clone()

    println("원본 = $original")
    println("복제 = $copy")

    val modified = copy.copy(name = "이몽룡")

    println("수정된 복제 : $modified")

    println("원본 == 복제? ${original == copy}")
    println("원본 === 복제? ${original === copy}")

}