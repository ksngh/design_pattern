package design_pattern.structural.bridge.abstraction

import design_pattern.structural.bridge.implementor.WindowImpl

abstract class Window(private val impl: WindowImpl) {
    abstract fun draw()

    fun drawBoarder() {
        impl.drawRect(0,0,100,100)
    }

    fun drawText(text : String) {
        impl.drawText(text)
    }

}