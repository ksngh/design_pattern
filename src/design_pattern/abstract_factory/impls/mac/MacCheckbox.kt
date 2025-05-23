package design_pattern.abstract_factory.impls.mac

import design_pattern.abstract_factory.interfaces.Checkbox

class MacCheckbox : Checkbox {
    override fun render(): String = "Rendering a Mac style checkbox"
}