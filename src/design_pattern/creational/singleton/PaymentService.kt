package design_pattern.creational.singleton

class PaymentService {

    fun processPayment(userId:String, amount:Int){
        val logger = Logger.getInstance()
        logger.log("사용자 $userId 가 $amount 원을 결제 시도함")
        logger.log("결제 성공 사용자 : $userId 금액 : $amount")
    }
}