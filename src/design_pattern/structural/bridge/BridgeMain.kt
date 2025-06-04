package design_pattern.structural.bridge

import design_pattern.structural.bridge.concrete_implementor.LinuxWindowImpl
import design_pattern.structural.bridge.concrete_implementor.MacWindowImpl
import design_pattern.structural.bridge.refined_abstraction.IconWindow
import design_pattern.structural.bridge.refined_abstraction.NormalWindow

fun main() {
    val linuxImpl = LinuxWindowImpl()
    val macImpl = MacWindowImpl()

    val normalOnLinux = NormalWindow(linuxImpl)
    val iconOnMac = IconWindow(macImpl)

    normalOnLinux.draw()
    println()
    iconOnMac.draw()
}