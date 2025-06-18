package design_pattern.behavior.command.command

import design_pattern.behavior.command.receiver.Document

class PasteCommand(private val document: Document) : Command  {
    override fun execute() {
        document.paste()
    }

}