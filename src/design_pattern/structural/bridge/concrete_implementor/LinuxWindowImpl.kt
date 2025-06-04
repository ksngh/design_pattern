package design_pattern.structural.bridge.concrete_implementor

import design_pattern.structural.bridge.implementor.WindowImpl

class LinuxWindowImpl : WindowImpl {
    override fun drawText(text: String) {
        println("리눅스: 텍스트 그리기 -> \"$text\"")
    }

    override fun drawRect(x: Int, y: Int, width: Int, height: Int) {
        println("리눅스: 사각형 그리기 -> 시작($x,$y) 크기 ($width*$height)")
    }

}