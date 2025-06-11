package design_pattern.behaviror.command

import design_pattern.behaviror.command.command.MacroCommand
import design_pattern.behaviror.command.command.OpenCommand
import design_pattern.behaviror.command.command.PasteCommand
import design_pattern.behaviror.command.invoker.MenuItem
import design_pattern.behaviror.command.receiver.Application
import design_pattern.behaviror.command.receiver.Document

fun main(){
    val app = Application()
    val doc = Document("MyDoc.txt")

    val pasteCommand = PasteCommand(doc)
    val openCommand = OpenCommand(app)

    val pasteMenu = MenuItem(pasteCommand)
    val openMenu = MenuItem(openCommand)

    println("Paste 메뉴 클릭:")
    pasteMenu.click()

    println("\nOpen 메뉴 클릭:")
    openMenu.click()

    println("\nMacroCommand 실행:")
    val macro = MacroCommand().apply{
        add(openCommand)
        add(pasteCommand)
    }
    macro.execute()

}