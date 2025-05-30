package design_pattern.creational.abstract_factory.impls.window

import design_pattern.creational.abstract_factory.interfaces.Checkbox

class WindowCheckbox : Checkbox {
    override fun render(): String = "Rendering a Window style checkbox"
}