package design_pattern.creational.factory

class EmailNotification : Notification {
    override fun notifyUser() {
        println("Email Notification")
    }

}