package design_pattern.behaviror.memento.caretaker

import design_pattern.behaviror.memento.memento.EditorMemento
import design_pattern.behaviror.memento.originator.Editor

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