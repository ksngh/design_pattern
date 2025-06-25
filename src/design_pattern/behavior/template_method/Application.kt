package design_pattern.behavior.template_method

abstract class Application {
    private val documents = mutableListOf<Document>()

    // Template Method
    fun openDocument(name: String){
        if (!canOpenDocument(name)){
            println("문서를 열 수 없습니다 : $name")
            return
        }

        val document = doCreateDocument()
        if(document != null){
            documents.add(document)
            aboutToOpenDocument(document)
            document.open()
            document.doRead()
        }
    }

    protected abstract fun canOpenDocument(name: String) : Boolean
    protected abstract fun doCreateDocument(): Document?

    protected open fun aboutToOpenDocument(document: Document){}
}