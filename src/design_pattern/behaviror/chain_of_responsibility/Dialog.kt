package design_pattern.behaviror.chain_of_responsibility

class Dialog(
    handler: HelpHandler,
    topic: Topic = Topic.NONE
) : Widget(null,topic){

    init{
        setHandler(handler,topic)
    }

    private var customSuccessor: HelpHandler? = handler

    private fun setHandler(handler: HelpHandler, topic: Topic){
        customSuccessor = handler
    }

    override fun handleHelp(){
        if(hasHelp()){
            println("Showing help from Dialog: $topic")
        }else{
            println("Dialog cannot handle, forwarding to application")
            customSuccessor?.handleHelp()
        }
    }

}