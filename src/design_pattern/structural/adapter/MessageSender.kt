package design_pattern.structural.adapter

interface MessageSender {
    fun sendMessage(destination: String, message: String)
}