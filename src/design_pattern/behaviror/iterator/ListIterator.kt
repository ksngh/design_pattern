package design_pattern.behaviror.iterator

class ListIterator<T>(private val list: List<T>) : Iterator<T> {
    private var current = 0

    override fun first() {
        current = 0
    }

    override fun next() {
        current++
    }

    override fun isDone(): Boolean = current >= list.count()

    override fun currentItem(): T {
        if(isDone()) throw IndexOutOfBoundsException("Out of bounds")
        return list.get(current)
    }

}