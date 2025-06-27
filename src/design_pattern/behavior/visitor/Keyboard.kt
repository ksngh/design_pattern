package design_pattern.behavior.visitor

class Keyboard : ComputerPart {
    override fun accept(visitor: ComputerPartVisitor) {
        visitor.visit(this)
    }
}