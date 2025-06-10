package design_pattern.behaviror.chain_of_responsibility

open class Widget(
    parent: HelpHandler?,
    topic: Topic = Topic.NONE
) : HelpHandler(parent, topic)
