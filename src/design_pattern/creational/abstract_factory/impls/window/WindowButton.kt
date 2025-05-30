package design_pattern.creational.abstract_factory.impls.window

import design_pattern.creational.abstract_factory.interfaces.Button

class WindowButton : Button {
    override fun render(): String = "Rendering a Window style button"
}