package design_pattern.behavior.visitor

class Computer : ComputerPart {

    private var parts: List<ComputerPart> = listOf(Keyboard(),Monitor())

    override fun accept(visitor: ComputerPartVisitor) {
        for (part in parts) {
            part.accept(visitor)
        }
        visitor.visit(this)
    }
}