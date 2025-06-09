package design_pattern.structural.composite

import design_pattern.structural.composite.composite.Directory
import design_pattern.structural.composite.leaf.File

fun main(){
    val file1 = File("hello.txt",10)
    val file2 = File("data.csv",30)
    val file3 = File("image.png",50)

    val dir1 = Directory("Documents")
    dir1.add(file1)
    dir1.add(file2)

    val dir2 = Directory("Pictures")
    dir2.add(file3)

    val dir3 = Directory("Data")
    dir3.add(file2)

    val root = Directory("Root")
    root.add(dir1)
    root.add(dir2)
    root.add(dir3)

    root.show()
}