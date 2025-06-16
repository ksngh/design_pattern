package design_pattern.behaviror.interpreter.expressions

import design_pattern.behaviror.interpreter.BooleanExpression
import design_pattern.behaviror.interpreter.Context

class VariableExpression(private val name : String) : BooleanExpression {
    override fun evaluate(context: Context): Boolean {
        return context.lookup(name)
    }

    override fun replace(name: String, expression: BooleanExpression): BooleanExpression {
        return if (this.name == name) expression.copy() else VariableExpression(this.name)
    }

    override fun copy(): BooleanExpression = VariableExpression(name)

}