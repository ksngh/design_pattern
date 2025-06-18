package design_pattern.behavior.command

import design_pattern.behavior.command.command.MacroCommand
import design_pattern.behavior.command.command.OpenCommand
import design_pattern.behavior.command.command.PasteCommand
import design_pattern.behavior.command.invoker.MenuItem
import design_pattern.behavior.command.receiver.Application
import design_pattern.behavior.command.receiver.Document

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