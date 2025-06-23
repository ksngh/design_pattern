package design_pattern.behavior.state.state

import design_pattern.behavior.state.context.TCPConnection

abstract class TCPState {
    open fun transmit(connection: TCPConnection, data :String){}
    open fun activeOpen(connection: TCPConnection){}
    open fun passiveOpen(connection: TCPConnection){}
    open fun close(connection: TCPConnection){}
    open fun send(connection: TCPConnection){}
    open fun synchronize(connection: TCPConnection){}

    protected fun changeState(connection: TCPConnection,state: TCPState){
        connection.changeState(state)
    }

}