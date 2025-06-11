package design_pattern.behaviror.command.receiver

class Application {
    private val documents = mutableListOf<Document>()

    fun addDocument(document: Document) {
        documents.add(document)
        println("Application에 문서 추가됨")
    }

}