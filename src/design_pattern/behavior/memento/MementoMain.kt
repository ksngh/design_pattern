package design_pattern.behavior.memento

import design_pattern.behavior.memento.caretaker.EditorHistory
import design_pattern.behavior.memento.originator.Editor

fun main(){
    val editor = Editor()
    val history = EditorHistory()

    editor.type("Hello, ")
    history.save(editor)

    editor.type("world")
    println(editor.getContent())

    history.undo(editor)
    println(editor.getContent())
}