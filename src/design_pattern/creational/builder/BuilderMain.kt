package design_pattern.creational.builder

fun main(){
    val user = User.Builder()
        .age(3)
        .email("admin@admin.com")
        .name("name")
        .build()
    println(user.age)
}