package design_pattern.creational.factory

class NotificationFactory {
    fun create(type: String): Notification? {
        return when(type.lowercase()){
            "sms" -> SMSNotification()
            "email" -> EmailNotification()
            "push" -> PushNotification()
            else -> null
        }
    }
}