package design_pattern.structural.facade

import design_pattern.structural.facade.facade.VideoConverterFacade

fun main(){
    val converter = VideoConverterFacade()
    val result = converter.convertVideo("my_video.avi", format = "mkv")

    println("🎉 최종 파일: $result")
}

