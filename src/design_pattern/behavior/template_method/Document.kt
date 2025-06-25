package design_pattern.behavior.template_method

abstract class Document {
    open fun open() {
        println("문서 열기 중...")
    }

    abstract fun doRead()
}