package design_pattern.creational.abstract_factory.factory

import design_pattern.creational.abstract_factory.interfaces.Button
import design_pattern.creational.abstract_factory.interfaces.Checkbox

interface GUIFactory {
    fun createButton() : Button
    fun createCheckbox() : Checkbox
}