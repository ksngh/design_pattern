package design_pattern.behaviror.command.command

import design_pattern.behaviror.command.receiver.Document

class PasteCommand(private val document: Document) : Command  {
    override fun execute() {
        document.paste()
    }

}