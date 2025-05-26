package design_pattern.factory

class PushNotification : Notification {
    override fun notifyUser() {
        println("PushNotification")
    }
}