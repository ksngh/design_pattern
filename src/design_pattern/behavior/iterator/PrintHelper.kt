package design_pattern.behavior.iterator

object PrintHelper {
    fun <T> printItems(iterator: Iterator<T>) {
        iterator.first()
        while(!iterator.isDone()){
            when (val item = iterator.currentItem()){
                is Employee -> item.print()
                else -> println(item)
            }
            iterator.next()
        }
    }
}