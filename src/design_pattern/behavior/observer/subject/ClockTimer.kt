package design_pattern.behavior.observer.subject

import design_pattern.behavior.observer.observer.Observer

class ClockTimer : Subject {

    private val observeres = mutableListOf<Observer>()

    var hour: Int = 0
        private set
    var minute: Int = 0
        private set
    var second: Int = 0
        private set

    override fun attach(observer: Observer) {
        observeres.add(observer)
    }

    override fun detach(observer: Observer) {
        observeres.remove(observer)
    }

    override fun notifyObservers() {
        observeres.forEach { it.update(this) }
    }

    fun tick(){
        second++
        if (second >= 60){
            second = 0
            minute++
        }
        if (minute >= 60){
            minute = 0
            hour++
        }
        if (hour >= 24){
            hour = 0
        }

        println("Tick : $hour:$minute:$second")
        notifyObservers()
    }
}