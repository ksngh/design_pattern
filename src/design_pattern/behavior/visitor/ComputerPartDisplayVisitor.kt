package design_pattern.behavior.visitor

class ComputerPartDisplayVisitor : ComputerPartVisitor {
    override fun visit(monitor: Monitor) {
        println("Displaying Monitor")
    }

    override fun visit(keyboard: Keyboard) {
        println("Displaying Keyboard")
    }

    override fun visit(computer: ComputerPart) {
        println("Displaying Computer")
    }
}