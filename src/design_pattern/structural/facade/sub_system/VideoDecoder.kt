package design_pattern.structural.facade.sub_system

class VideoDecoder {
    fun decode(filename : String) : String {
        println("비디오 디코딩 중 : $filename")
        return "raw_video_data"
    }
}