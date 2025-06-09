package design_pattern.structural.decorator.concrete_decorator

import design_pattern.structural.decorator.component.Message

abstract class MessageDecorator(private val component: Message) : Message {
    override fun getContent(): String = component.getContent()
}