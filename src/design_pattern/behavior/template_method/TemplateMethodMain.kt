package design_pattern.behavior.template_method

fun main(){
    val app = DrawApplication()

    println("1. 잘못된 파일 시도")
    app.openDocument("file.txt")

    println("\n2. 올바른 그림 파일 시도")
    app.openDocument("sketch.draw")
}