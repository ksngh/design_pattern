package design_pattern.behavior.observer

import design_pattern.behavior.observer.observer.AnalogClock
import design_pattern.behavior.observer.observer.DigitalClock
import design_pattern.behavior.observer.subject.ClockTimer

fun main(){
    val timer = ClockTimer()
    val digitalClock = DigitalClock(timer)
    val analogClock = AnalogClock(timer)

    repeat(3) {
        Thread.sleep(1000)
        timer.tick()
    }
}