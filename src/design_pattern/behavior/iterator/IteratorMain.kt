package design_pattern.behavior.iterator

fun main(){
    val employees = List<Employee>().apply{
        add(Employee("홍길동"))
        add(Employee("김철수"))
        add(Employee("이영희"))
    }

    val forwardIterator = ListIterator(employees)
    val reverseIterator = ReverseListIterator(employees)

    println("정방향 순회:")
    PrintHelper.printItems(forwardIterator)

    println("역방향 순회:")
    PrintHelper.printItems(reverseIterator)
}