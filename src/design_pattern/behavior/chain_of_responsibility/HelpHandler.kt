package design_pattern.behavior.chain_of_responsibility

open class HelpHandler(
    private val successor: HelpHandler? = null,
    protected val topic: Topic = Topic.NONE
) {
    open fun hasHelp(): Boolean = topic != Topic.NONE

    open fun handleHelp() {
        if (hasHelp()) {
            println("Showing help for topic: $topic")
        } else {
            successor?.handleHelp()
        }
    }
}