package design_pattern.behavior.chain_of_responsibility

fun main(){
    val application = Application(Topic.APPLICATION)
    val dialog = Dialog(application, Topic.PRINT_DIALOG)
    val button = Button(dialog, Topic.PAPER_ORIENTATION)

    println("== 버튼에서 도움말 요청 ==")
    button.handleHelp()

    val dialog2 = Dialog(application, Topic.NONE)
    val button2 = Button(dialog2, Topic.NONE)
    println("\n== 버튼에서 도움말 없음 -> 다이얼로그도 없음 -> 앱으로 ==")
    button2.handleHelp()
}