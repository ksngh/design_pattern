package design_pattern.structural.composite

interface FileSystemComponent {
    val name : String
    fun show(indent: String = "")
}