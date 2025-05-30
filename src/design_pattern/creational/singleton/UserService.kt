package design_pattern.creational.singleton

class UserService {
    fun login(userId: String){
        val logger = Logger.getInstance()
        logger.log("사용자 $userId 로그인 시도")
        logger.log("사용자 $userId 로그인 성공")
    }
}