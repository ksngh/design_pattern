package design_pattern.behavior.observer.subject

import design_pattern.behavior.observer.observer.Observer

interface Subject {
    fun attach(observer : Observer)
    fun detach(observer : Observer)
    fun notifyObservers()
}