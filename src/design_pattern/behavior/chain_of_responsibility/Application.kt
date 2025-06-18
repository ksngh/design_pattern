package design_pattern.behavior.chain_of_responsibility

class Application(topic :Topic) :HelpHandler(null,topic) {
    override fun handleHelp() {
        println("Showing general help from Application : $topic")
    }
}