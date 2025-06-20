package design_pattern.behavior.observer.observer

import design_pattern.behavior.observer.subject.ClockTimer
import design_pattern.behavior.observer.subject.Subject

class AnalogClock(private val timer: ClockTimer) : Observer {
    init {
        timer.attach(this)
    }

    override fun update(subject: Subject) {
        if (subject is ClockTimer) {
            draw(subject)
        }
    }

    private fun draw(timer: ClockTimer) {
        println("Analog Clock => Hour hand at ${timer.hour}, Minute hand at ${timer.minute}, Second hand at ${timer.second}")
    }
}