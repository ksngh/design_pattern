package design_pattern.behaviror.mediator

interface ChatMediator {
    fun sendMessage(message: String, sender:User)
    fun addUser(user:User)
}