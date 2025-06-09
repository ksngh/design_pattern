package design_pattern.structural.proxy.proxy

import design_pattern.structural.proxy.Point
import design_pattern.structural.proxy.real_subject.Image
import design_pattern.structural.proxy.subject.Graphic

class ImageProxy(private val fileName : String) : Graphic {
    private var image : Image? = null
    private var extent: Point? = null

    private fun getImage():Image{
        if (image == null) {
            image = Image(fileName)
        }
        return image!!
    }

    override fun draw(at: Point) {
        getImage().draw(at)
    }

    override fun getExtent(): Point {
        if(extent == null) {
            extent = getImage().getExtent()
        }
        return extent!!
    }

}