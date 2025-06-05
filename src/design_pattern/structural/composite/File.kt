package design_pattern.structural.composite

class File(override val name: String, val size: Int) : FileSystemComponent {
    override fun show(indent: String) {
        println("$indent- File: $name(${size}KB)")
    }

}