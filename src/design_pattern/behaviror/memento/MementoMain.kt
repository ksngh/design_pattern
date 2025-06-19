package design_pattern.behaviror.memento

import design_pattern.behaviror.memento.caretaker.EditorHistory
import design_pattern.behaviror.memento.originator.Editor

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