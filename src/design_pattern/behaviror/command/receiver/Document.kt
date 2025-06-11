package design_pattern.behaviror.command.receiver

class Document(private val name: String) {

    fun open() {
        println("문서 '$name' 열기")
    }

    fun paste() {
        println("문서 '$name'에 텍스트 붙여넣기")
    }

}