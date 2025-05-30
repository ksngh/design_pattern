package design_pattern.creational.singleton

fun main(){
    val userService = UserService()
    val paymentService = PaymentService()

    val userId = "kimseongho"
    val amount = 10000

    userService.login(userId)
    paymentService.processPayment(userId,amount)

    val logger1 = Logger.getInstance()
    val logger2 = Logger.getInstance()
    println("logger1 === logger2 ? ${logger1 === logger2}") // true
}