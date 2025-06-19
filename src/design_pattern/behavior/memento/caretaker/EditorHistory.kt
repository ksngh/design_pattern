package design_pattern.behavior.memento.caretaker

import design_pattern.behavior.memento.memento.EditorMemento
import design_pattern.behavior.memento.originator.Editor

class EditorHistory {

    private val history = mutableListOf<EditorMemento>()

    fun save(editor: Editor){
        history.add(editor.save())
    }

    fun undo(editor: Editor){
        if(history.isNotEmpty()){
            val lastState = history.removeAt(history.lastIndex)
            editor.restore(lastState)
        }
    }
}