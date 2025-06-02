package design_pattern.structural.adapter

class SlackNotifier {
    fun sendToSlack(channel: String, content: String) {
        println("Slack 전송 -> [$channel] $content")
    }
}