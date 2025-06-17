package design_pattern.behaviror.iterator

interface Iterator<T> {
    fun first()
    fun next()
    fun isDone(): Boolean
    fun currentItem() : T
}