package design_pattern.behavior.mediator

interface ChatMediator {
    fun sendMessage(message: String, sender:User)
    fun addUser(user:User)
}