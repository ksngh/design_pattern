package design_pattern.behaviror.mediator

fun main(){
    val chatRoom = ChatRoom()

    val alice = ChatUser("Alice",chatRoom)
    val bob = ChatUser("Bob",chatRoom)
    val charlie = ChatUser("Charlie",chatRoom)

    chatRoom.addUser(alice)
    chatRoom.addUser(bob)
    chatRoom.addUser(charlie)

    alice.send("안녕하세요!")
    bob.send("반가워요!")
    charlie.send("다들 오늘 어때요?")
}