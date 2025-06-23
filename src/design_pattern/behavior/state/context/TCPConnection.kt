package design_pattern.behavior.state.context

import design_pattern.behavior.state.concrete_state.TCPClosed
import design_pattern.behavior.state.state.TCPState

class TCPConnection {
    private var state: TCPState = TCPClosed

    fun activeOpen() = state.activeOpen(this)
    fun passiveOpen() = state.passiveOpen(this)
    fun close() = state.close(this)
    fun send() = state.send(this)
    fun synchronize() = state.synchronize(this)
    fun transmit(data: String) = state.transmit(this,data)

    fun changeState(newState : TCPState){
        println("TCPConnection: 상태 변경 -> ${newState::class.simpleName}")
        state = newState
    }

    fun processData(data: String){
        println("TCPConnection: 데이터 처리 = \"${data}\"")
    }


}