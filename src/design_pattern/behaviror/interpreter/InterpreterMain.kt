package design_pattern.behaviror.interpreter

import design_pattern.behaviror.interpreter.expressions.*

fun main(){
    val x = VariableExpression("X")
    val y = VariableExpression("Y")

    // (true AND X) OR (Y AND (NOT X))
    val expression: BooleanExpression = OrExpression(
        AndExpression(ConstantExpression(true),x),
        AndExpression(y,NotExpression(x))
    )

    val context = Context()
    context.assign("X",false)
    context.assign("Y",true)

    println("초기 평가 결과: ${expression.evaluate(context)}")

    // Y를 NOT Z로 교체
    val z = VariableExpression("Z")
    val notZ = NotExpression(z)
    val replaced = expression.replace("Y",notZ)

    context.assign("Z",true)
    println("🔁 Z로 교체 후 평가 결과: ${replaced.evaluate(context)}")  // false

}