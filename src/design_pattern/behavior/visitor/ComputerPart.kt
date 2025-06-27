package design_pattern.behavior.visitor

interface ComputerPart {
    fun accept(visitor: ComputerPartVisitor)
}