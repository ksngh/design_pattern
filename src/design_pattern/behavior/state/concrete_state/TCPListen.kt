package design_pattern.behavior.state.concrete_state

import design_pattern.behavior.state.context.TCPConnection
import design_pattern.behavior.state.state.TCPState

object TCPListen : TCPState() {
    override fun send(connection: TCPConnection) {
        println("[TCPListen] send: SYN 전송 및 연결 수립")
        changeState(connection, TCPEstablished)
    }
}