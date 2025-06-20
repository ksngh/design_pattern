package design_pattern.behavior.iterator

interface Iterator<T> {
    fun first()
    fun next()
    fun isDone(): Boolean
    fun currentItem() : T
}