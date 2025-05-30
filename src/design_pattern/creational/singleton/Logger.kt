package design_pattern.creational.singleton

class Logger private constructor() {

    init {
        println("Logger 인스턴스 실행")
    }

    fun log(message: String) {
        println("[LOG] $message")
    }

    companion object {
        @Volatile
        private var instance: Logger? = null

        fun getInstance(): Logger {
            return instance ?: synchronized(this) {
                instance ?: Logger().also {instance = it}
            }
        }
    }

}