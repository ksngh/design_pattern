package design_pattern.behavior.command.invoker

import design_pattern.behavior.command.command.Command

class MenuItem(private var command: Command) {
    fun click(){
        command.execute()
    }

    fun setCommand(newCommand: Command){
        command = newCommand
    }

}