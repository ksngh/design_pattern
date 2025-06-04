package design_pattern.structural.bridge.refined_abstraction

import design_pattern.structural.bridge.implementor.WindowImpl
import design_pattern.structural.bridge.abstraction.Window

class NormalWindow(impl: WindowImpl) : Window(impl) {
    override fun draw() {
        println("[NormalWindow]")
        drawBoarder()
        drawText("일반 창입니다.")
    }
}