package design_pattern.structural.flyweight.concrete_flyweight

import design_pattern.structural.flyweight.flyweight.Glyph

class CharacterGlyph(private val char : Char) : Glyph {
    override fun draw(position: Int, font: String) {
        println("Drawing Character('$char') at position $position with font '$font'")
    }
}