package design_pattern.structural.decorator.decorator

import design_pattern.structural.decorator.component.Message
import design_pattern.structural.decorator.concrete_decorator.MessageDecorator
import java.util.*

class Base64EncoderDecorator(component: Message) : MessageDecorator(component) {
    override fun getContent(): String{
        val content = super.getContent()
        return Base64.getEncoder().encodeToString(content.toByteArray())
    }
}