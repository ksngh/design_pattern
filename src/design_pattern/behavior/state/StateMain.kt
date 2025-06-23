package design_pattern.behavior.state

import design_pattern.behavior.state.context.TCPConnection

fun main() {
    val connection = TCPConnection()

    connection.passiveOpen()      // TCPClosed → TCPListen
    connection.send()             // TCPListen → TCPEstablished
    connection.transmit("Hello")  // 데이터 전송
    connection.close()            // TCPEstablished → TCPListen
}