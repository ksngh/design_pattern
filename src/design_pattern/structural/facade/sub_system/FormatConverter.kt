package design_pattern.structural.facade.sub_system

class FormatConverter {
    fun convert(data:String, format:String) : String {
        println("포맷 변환 중 ... -> $format")
        return "converted_video.$format"
    }
}