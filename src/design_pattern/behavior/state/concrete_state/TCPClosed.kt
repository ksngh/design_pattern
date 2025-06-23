package design_pattern.behavior.state.concrete_state

import design_pattern.behavior.state.context.TCPConnection
import design_pattern.behavior.state.state.TCPState

object TCPClosed : TCPState() {

    override fun activeOpen(connection: TCPConnection) {
        println("[TCPClosed] activeOpen: SYN 전송 및 연결 요청")
        changeState(connection, TCPEstablished)
    }

    override fun passiveOpen(connection: TCPConnection) {
        println("[TCPClosed] passiveOpen: 수신 대기 상태로 전환")
        changeState(connection, TCPListen)
    }

}