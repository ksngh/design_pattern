package design_pattern.behavior.interpreter.expressions

import design_pattern.behavior.interpreter.BooleanExpression
import design_pattern.behavior.interpreter.Context

class NotExpression(
    private val operand: BooleanExpression
) : BooleanExpression {

    override fun evaluate(context: Context): Boolean {
        return !operand.evaluate(context)
    }

    override fun replace(name: String, expression: BooleanExpression): BooleanExpression {
        return NotExpression(operand.replace(name, expression))
    }

    override fun copy(): BooleanExpression {
        return NotExpression(operand.copy())
    }
}