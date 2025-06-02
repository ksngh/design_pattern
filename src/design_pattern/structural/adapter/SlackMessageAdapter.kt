package design_pattern.structural.adapter

class SlackMessageAdapter (private val slackNotifier: SlackNotifier) : MessageSender {
    override fun sendMessage(destination: String, message: String) {
        slackNotifier.sendToSlack(destination, message)
    }

}