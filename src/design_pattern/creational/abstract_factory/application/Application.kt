package design_pattern.creational.abstract_factory.application

import design_pattern.creational.abstract_factory.factory.GUIFactory

class Application (private val factory: GUIFactory){
    fun renderUI(){
        val button = factory.createButton()
        val checkbox = factory.createCheckbox()
        println(button.render())
        println(checkbox.render())
    }
}