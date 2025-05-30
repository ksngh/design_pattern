package design_pattern.creational.abstract_factory.factory

import design_pattern.creational.abstract_factory.impls.mac.MacButton
import design_pattern.creational.abstract_factory.impls.mac.MacCheckbox
import design_pattern.creational.abstract_factory.interfaces.Button
import design_pattern.creational.abstract_factory.interfaces.Checkbox

class MacFactory : GUIFactory {
    override fun createButton(): Button = MacButton()
    override fun createCheckbox(): Checkbox = MacCheckbox()

}