package design_pattern.factory

class SMSNotification : Notification {
    override fun notifyUser() {
        println("SMSNotification")
    }
}