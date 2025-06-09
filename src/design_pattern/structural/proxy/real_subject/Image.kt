package design_pattern.structural.proxy.real_subject

import design_pattern.structural.proxy.Point
import design_pattern.structural.proxy.subject.Graphic

class Image(private val fileName: String) : Graphic {
    init{
        println("Loading image from $fileName")
    }

    override fun draw(at: Point) {
        println("Drawing image $fileName at position $at")
    }

    override fun getExtent(): Point {
        return Point(640,480)
    }
}