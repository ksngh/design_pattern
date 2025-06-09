package design_pattern.structural.proxy

import design_pattern.structural.proxy.proxy.ImageProxy
import design_pattern.structural.proxy.subject.Graphic

fun main(){
    val proxy: Graphic = ImageProxy("sample.png")

    println("Proxy created.")
    println("Getting image extent (without loading image)...")
    println("Extent: ${proxy.getExtent()}")

    println("Now drawing the image:")
    proxy.draw(Point(100,200))
}

