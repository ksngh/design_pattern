package design_pattern.behavior.strategy

interface Compositor {
    fun compose(
        natural: IntArray,
        stretch: IntArray,
        shrink: IntArray,
        componentCount: Int,
        lineWidth: Int,
        breaks: IntArray
    ): Int
}