package design_pattern.structural.decorator.concrete_component

import design_pattern.structural.decorator.component.Message

class PlainMessage(private val text: String) : Message {
    override fun getContent(): String = text
}