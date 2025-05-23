package design_pattern.builder

class User private constructor(
    val name: String?,
    val age: Int?,
    val email: String?
) {
    data class Builder(
        var name: String ? = null,
        var age: Int ? = null,
        var email: String ? = null
    ){
        fun name(name: String) = apply { this.name = name }
        fun age(age: Int) = apply { this.age = age }
        fun email(email: String) = apply { this.email = email }
        fun build() = User(name, age, email)
    }
}