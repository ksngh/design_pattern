package design_pattern.structural.flyweight.flyweight_factory

import design_pattern.structural.flyweight.concrete_flyweight.CharacterGlyph
import design_pattern.structural.flyweight.flyweight.Glyph

class GlyphFactory {
    private val characterPool = mutableMapOf<Char, Glyph>()

    fun getCharacter(char: Char): Glyph {
        return characterPool.getOrPut(char) {
            println("Creating new shared Character('$char')")
            CharacterGlyph(char)
        }
    }
}