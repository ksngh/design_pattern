package design_pattern.structural.decorator.decorator

import design_pattern.structural.decorator.component.Message
import design_pattern.structural.decorator.concrete_decorator.MessageDecorator

class BracketDecorator(component: Message) : MessageDecorator(component) {
    override fun getContent(): String = "[${super.getContent()}]"
}