package design_pattern.structural.decorator

import design_pattern.structural.decorator.concrete_component.PlainMessage
import design_pattern.structural.decorator.decorator.Base64EncoderDecorator
import design_pattern.structural.decorator.decorator.BracketDecorator
import design_pattern.structural.decorator.decorator.HtmlBoldDecorator

fun main() {
    val raw = PlainMessage("Decorator Pattern")

    val decorated = Base64EncoderDecorator(HtmlBoldDecorator(BracketDecorator(raw)))

    println(decorated.getContent())
}