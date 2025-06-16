package design_pattern.behaviror.interpreter

class Context {
    private val variables = mutableMapOf<String,Boolean>()

    fun assign(name: String, value: Boolean) {
        variables[name] = value
    }

    fun lookup(name: String): Boolean {
        return variables[name] ?: error("Variable $name is not defined")
    }
}