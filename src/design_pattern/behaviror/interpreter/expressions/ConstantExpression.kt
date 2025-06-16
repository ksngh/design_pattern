package design_pattern.behaviror.interpreter.expressions

import design_pattern.behaviror.interpreter.BooleanExpression
import design_pattern.behaviror.interpreter.Context

class ConstantExpression(private val value: Boolean) : BooleanExpression {
    override fun evaluate(context: Context): Boolean = value

    override fun replace(name: String, expression: BooleanExpression): BooleanExpression = this

    override fun copy(): BooleanExpression = ConstantExpression(value)

}