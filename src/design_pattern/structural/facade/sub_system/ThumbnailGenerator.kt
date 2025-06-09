package design_pattern.structural.facade.sub_system

class ThumbnailGenerator {
    fun generate(videoData : String) : String {
        println("썸네일 생성 중...")
        return "thumbnail.png"
    }
}