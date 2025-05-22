package design_pattern.abstract_factory.impls.mac

import design_pattern.abstract_factory.interfaces.Button

class MacButton : Button {
    override fun render(): String = "Rendering a Mac style button"

}