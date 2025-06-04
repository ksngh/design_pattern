package design_pattern.structural.bridge.implementor

interface WindowImpl {
    fun drawText(text : String)
    fun drawRect(x:Int, y:Int, width: Int, height: Int)
}