package design_pattern.behavior.state.concrete_state

import design_pattern.behavior.state.context.TCPConnection
import design_pattern.behavior.state.state.TCPState

object TCPEstablished : TCPState() {
    override fun transmit(connection: TCPConnection, data: String) {
        println("[TCPEstablished] transmit: 데이터 전송 중...")
        connection.processData(data)
    }

    override fun close(connection: TCPConnection) {
        println("[TCPEstablished] close: FIN 전송 → 수신 대기")
        changeState(connection, TCPListen)
    }
}