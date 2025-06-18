package design_pattern.behavior.command.command

import design_pattern.behavior.command.receiver.Application
import design_pattern.behavior.command.receiver.Document

class OpenCommand(private val application : Application) : Command {
    override fun execute() {
        val name = askUser()
        if(name.isNotBlank()){
            val doc = Document(name)
            application.addDocument(doc)
            doc.open()
        }

    }

    private fun askUser(): String {
        return "NewDocument.txt"
    }
}