package design_pattern.behavior.observer.observer

import design_pattern.behavior.observer.subject.ClockTimer
import design_pattern.behavior.observer.subject.Subject

class DigitalClock(private val timer : ClockTimer) : Observer {

    init {
        timer.attach(this)
    }

    override fun update(subject: Subject) {
        if (subject is ClockTimer) {
            draw(subject)
        }
    }

    private fun draw(timer: ClockTimer) {
        println("Digital Clock => ${String.format("%02d:%02d:%02d", timer.hour, timer.minute, timer.second)}")
    }

}