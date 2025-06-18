package design_pattern.behavior.iterator

class List<T>(private val items: MutableList<T> = mutableListOf()) {
    fun add(item: T) = items.add(item)
    fun count(): Int = items.size
    fun get(index:Int) : T = items[index]
}