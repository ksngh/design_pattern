package design_pattern.behavior.visitor

class Monitor : ComputerPart {
    override fun accept(visitor: ComputerPartVisitor) {
        visitor.visit(this)
    }
}