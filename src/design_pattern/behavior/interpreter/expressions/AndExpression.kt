package design_pattern.behavior.interpreter.expressions

import design_pattern.behavior.interpreter.BooleanExpression
import design_pattern.behavior.interpreter.Context

class AndExpression(
    private val left: BooleanExpression,
    private val right: BooleanExpression
) : BooleanExpression {
    override fun evaluate(context: Context): Boolean {
        return left.evaluate(context) && right.evaluate(context)
    }

    override fun replace(name: String, expression: BooleanExpression): BooleanExpression {
        return AndExpression(left.replace(name, expression), right.replace(name, expression))
    }

    override fun copy(): BooleanExpression {
        return AndExpression(left.copy(), right.copy())
    }
}