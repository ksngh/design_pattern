package design_pattern.structural.adapter

fun main(){
    val legacySlack = SlackNotifier()
    val sender: MessageSender = SlackMessageAdapter(legacySlack)

    sender.sendMessage("#general", "어댑터 패턴 테스트 메시지입니다.")
}