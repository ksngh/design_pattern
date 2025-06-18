package design_pattern.behavior.interpreter

interface BooleanExpression {
    fun evaluate(context : Context) : Boolean
    fun replace(name: String, expression : BooleanExpression) : BooleanExpression
    fun copy() : BooleanExpression
}