package design_pattern.behavior.visitor

fun main(){
    val computer = Computer()
    val displayVisitor = ComputerPartDisplayVisitor()

    computer.accept(displayVisitor)
}