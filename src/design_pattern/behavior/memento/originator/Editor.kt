package design_pattern.behavior.memento.originator

import design_pattern.behavior.memento.memento.EditorMemento

class Editor {
    private var content : String = ""

    fun type(words : String){
        content += words
    }

    fun getContent(): String = content

    fun save() : EditorMemento {
        return EditorMemento(content)
    }

    fun restore(memento : EditorMemento){
        content = memento.content
    }

}