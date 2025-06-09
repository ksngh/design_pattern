package design_pattern.structural.flyweight

import design_pattern.structural.flyweight.flyweight_factory.GlyphFactory
import design_pattern.structural.flyweight.unshared_concrete_flyweight.Row

fun main() {
    val factory = GlyphFactory()

    val row1 = Row()
    row1.add(factory.getCharacter('H'))
    row1.add(factory.getCharacter('e'))
    row1.add(factory.getCharacter('l'))
    row1.add(factory.getCharacter('l'))
    row1.add(factory.getCharacter('o'))

    val row2 = Row()
    row2.add(factory.getCharacter('W'))
    row2.add(factory.getCharacter('o'))
    row2.add(factory.getCharacter('r'))
    row2.add(factory.getCharacter('l'))
    row2.add(factory.getCharacter('d'))

    println("\n== Drawing Row 1 ==")
    row1.draw(position = 0, font = "Arial")

    println("\n== Drawing Row 2 ==")
    row2.draw(position = 100, font = "Times New Roman")
}
