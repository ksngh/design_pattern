package design_pattern.structural.composite.component

interface FileSystemComponent {
    val name : String
    fun show(indent: String = "")
}