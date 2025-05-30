package design_pattern.creational.prototype

data class Person(
    val name : String,
    val age: Int,
    val hobbies: List<String>
) : Prototype<Person> {
    override fun clone(): Person {
        return Person(name,age,hobbies.toList())
    }
}