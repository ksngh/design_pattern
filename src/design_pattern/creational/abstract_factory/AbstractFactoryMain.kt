package design_pattern.creational.abstract_factory

import design_pattern.creational.abstract_factory.application.Application
import design_pattern.creational.abstract_factory.factory.GUIFactory
import design_pattern.creational.abstract_factory.factory.MacFactory
import design_pattern.creational.abstract_factory.factory.WindowFactory

fun main(){
    val os = "windows"
    val factory: GUIFactory = when (os) {
        "mac" -> MacFactory()
        "windows" -> WindowFactory()
        else -> throw IllegalArgumentException("Unknown OS: $os")
    }

    val app = Application(factory)
    app.renderUI()

}