package design_pattern.behavior.strategy

class Composition(private var compositor: Compositor) {

    private lateinit var components: List<Component> // 실제 텍스트 요소 등
    private var lineWidth: Int = 100
    private lateinit var lineBreaks: IntArray

    fun setComponents(components: List<Component>) {
        this.components = components
    }

    fun repair() {
        val componentCount = components.size
        val natural = IntArray(componentCount) { components[it].natural }
        val stretch = IntArray(componentCount) { components[it].stretch }
        val shrink = IntArray(componentCount) { components[it].shrink }
        val breaks = IntArray(componentCount)

        val breakCount = compositor.compose(
            natural, stretch, shrink, componentCount, lineWidth, breaks
        )

        lineBreaks = breaks.copyOf(breakCount)
        println("Line breaks at indices: ${lineBreaks.joinToString()}")
    }

    fun changeCompositor(newCompositor: Compositor) {
        this.compositor = newCompositor
    }
}