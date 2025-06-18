package design_pattern.behaviror.mediator

abstract class User(
    val name : String,
    protected val mediator : ChatMediator
    ) {
    abstract fun send(message : String)
    abstract fun receive(message: String, from: String)
}