package design_pattern.structural.flyweight.flyweight

interface Glyph {
    fun draw(position: Int = 0 , font: String = "DefaultFont")
}