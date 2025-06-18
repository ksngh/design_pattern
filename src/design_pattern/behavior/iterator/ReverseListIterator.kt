package design_pattern.behavior.iterator

class ReverseListIterator<T>(private val list: List<T>) : Iterator<T> {
    private var current = list.count()-1

    override fun first() {
        current = list.count() - 1
    }

    override fun next() {
        current--
    }

    override fun isDone(): Boolean = current < 0

    override fun currentItem(): T {
        if (isDone()) throw IndexOutOfBoundsException("Out of bounds")
        return list.get(current)
    }

}