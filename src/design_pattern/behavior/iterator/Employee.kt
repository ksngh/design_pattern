package design_pattern.behavior.iterator

data class Employee(val name : String) {
    fun print() = println("Employee: $name")
}