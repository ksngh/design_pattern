package design_pattern.behavior.mediator

class ChatUser(name : String, mediator: ChatMediator) : User(name,mediator) {

    override fun send(message: String) {
        println("[$name] 전송: \"$message\"")
        mediator.sendMessage(message,this)
    }

    override fun receive(message: String, from: String) {
        println("[$name] <- [$from]: \"$message\"]")
    }
}