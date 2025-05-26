package design_pattern.factory

class EmailNotification : Notification {
    override fun notifyUser() {
        println("Email Notification")
    }

}