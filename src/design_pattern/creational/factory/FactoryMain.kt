package design_pattern.creational.factory

fun main(){
    val factory = NotificationFactory()
    val notification01 = factory.create("sms")
    notification01?.notifyUser()

    val notification02 = factory.create("email")
    notification02?.notifyUser()

    val notification03 = factory.create("push")
    notification03?.notifyUser()

    val notification04 = factory.create("phone")
    notification04?.notifyUser()

    val notificationInvalid = factory.create("fax")
    notificationInvalid?.notifyUser() ?: println("Invalid notification type.")
}