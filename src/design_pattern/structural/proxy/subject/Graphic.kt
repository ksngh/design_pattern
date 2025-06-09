package design_pattern.structural.proxy.subject

import design_pattern.structural.proxy.Point

interface Graphic {
    fun draw(at: Point)
    fun getExtent(): Point
}