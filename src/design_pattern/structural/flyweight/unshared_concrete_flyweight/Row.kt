package design_pattern.structural.flyweight.unshared_concrete_flyweight

import design_pattern.structural.flyweight.flyweight.Glyph

class Row : Glyph {
    private val children = mutableListOf<Glyph>()

    fun add(child: Glyph) {
        children.add(child)
    }

    override fun draw(position: Int, font: String) {
         println("Drawing row:")
        var currentPos = position
        children.forEach{
            it.draw(currentPos++, font)
        }
    }

}