package design_pattern.behaviror.chain_of_responsibility

class Button(
    parent: HelpHandler,
    topic: Topic = Topic.NONE
) : Widget(parent, topic) {

    override fun handleHelp() {
        if (hasHelp()) {
            println("Showing help from Button: $topic")
        } else {
            println("Button cannot handle, forwarding to parent")
            super.handleHelp()
        }
    }
}