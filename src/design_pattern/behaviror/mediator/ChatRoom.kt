package design_pattern.behaviror.mediator

class ChatRoom : ChatMediator {
    private val users = mutableSetOf<User>()

    override fun sendMessage(message: String, sender: User) {
        for (user in users){
            if(user != sender){
                user.receive(message,sender.name)
            }
        }
    }

    override fun addUser(user: User) {
        users.add(user)
    }
}