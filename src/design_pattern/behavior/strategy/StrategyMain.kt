package design_pattern.behavior.strategy

fun main() {
    val components = listOf(
        Component(30, 5, 2),
        Component(40, 5, 2),
        Component(50, 5, 2),
        Component(20, 5, 2),
        Component(60, 5, 2),
    )

    val simpleComposition = Composition(SimpleCompositor())
    simpleComposition.setComponents(components)
    simpleComposition.repair()

    val arrayComposition = Composition(ArrayCompositor(2))
    arrayComposition.setComponents(components)
    arrayComposition.repair()
}