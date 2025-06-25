package design_pattern.behavior.strategy

class ArrayCompositor(private val interval: Int) : Compositor {
    override fun compose(
        natural: IntArray,
        stretch: IntArray,
        shrink: IntArray,
        componentCount: Int,
        lineWidth: Int,
        breaks: IntArray
    ): Int {
        var count = 0
        for (i in interval until componentCount step interval) {
            breaks[count++] = i
        }
        return count
    }
}