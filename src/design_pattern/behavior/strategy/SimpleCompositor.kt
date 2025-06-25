package design_pattern.behavior.strategy

class SimpleCompositor : Compositor {
    override fun compose(
        natural: IntArray,
        stretch: IntArray,
        shrink: IntArray,
        componentCount: Int,
        lineWidth: Int,
        breaks: IntArray
    ): Int {
        var count = 0
        var sum = 0
        for (i in 0 until componentCount) {
            sum += natural[i]
            if (sum > lineWidth) {
                breaks[count++] = i
                sum = natural[i]
            }
        }
        return count
    }
}