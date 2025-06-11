package design_pattern.behaviror.command.invoker

import design_pattern.behaviror.command.command.Command

class MenuItem(private var command: Command) {
    fun click(){
        command.execute()
    }

    fun setCommand(newCommand: Command){
        command = newCommand
    }

}