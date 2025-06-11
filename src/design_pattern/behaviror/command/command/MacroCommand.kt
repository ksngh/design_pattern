package design_pattern.behaviror.command.command

class MacroCommand : Command {

    private val commands = mutableListOf<Command>()

    fun add(command : Command){
        commands.add(command)
    }

    fun remove(command : Command){
        commands.remove(command)
    }

    override fun execute() {
        commands.forEach {it.execute()}
    }
}