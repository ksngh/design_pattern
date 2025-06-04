package design_pattern.structural.bridge.refined_abstraction

import design_pattern.structural.bridge.implementor.WindowImpl
import design_pattern.structural.bridge.abstraction.Window

class IconWindow(impl: WindowImpl) : Window(impl)  {
    override fun draw() {
        println("[IconWindow]")
        drawBoarder()
        drawText("아이콘 창입니다.")
    }

}