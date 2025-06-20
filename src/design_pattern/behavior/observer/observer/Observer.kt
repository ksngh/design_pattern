package design_pattern.behavior.observer.observer

import design_pattern.behavior.observer.subject.Subject

interface Observer {
    fun update(subject: Subject)
}