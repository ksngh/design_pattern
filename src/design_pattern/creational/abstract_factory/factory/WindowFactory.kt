package design_pattern.creational.abstract_factory.factory

import design_pattern.creational.abstract_factory.impls.window.WindowButton
import design_pattern.creational.abstract_factory.impls.window.WindowCheckbox
import design_pattern.creational.abstract_factory.interfaces.Button
import design_pattern.creational.abstract_factory.interfaces.Checkbox

class WindowFactory : GUIFactory {
    override fun createButton(): Button = WindowButton()
    override fun createCheckbox(): Checkbox = WindowCheckbox()
}