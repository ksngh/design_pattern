package design_pattern.structural.composite

class Directory(override val name: String) : FileSystemComponent {

    private val children = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        children.add(component)
    }

    fun remove(component: FileSystemComponent) {
        children.remove(component)
    }

    override fun show(indent: String) {
        println("$indent+ Directory: $name")
        children.forEach {it.show(indent + " ") }
    }

}