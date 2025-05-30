package design_pattern.creational.factory

class SMSNotification : Notification {
    override fun notifyUser() {
        println("SMSNotification")
    }
}