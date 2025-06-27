package design_pattern.behavior.visitor

interface ComputerPartVisitor {
    fun visit(monitor: Monitor)
    fun visit(keyboard: Keyboard)
    fun visit(computer: ComputerPart)
}