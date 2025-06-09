package design_pattern.structural.facade.facade

import design_pattern.structural.facade.sub_system.FormatConverter
import design_pattern.structural.facade.sub_system.ThumbnailGenerator
import design_pattern.structural.facade.sub_system.VideoDecoder

class VideoConverterFacade {
    private val decoder = VideoDecoder()
    private val converter = FormatConverter()
    private val generator = ThumbnailGenerator()

    fun convertVideo(inputFile : String, format : String = "mp4") : String {
        println("비디오 변환 시작 : $inputFile")

        val rawData = decoder.decode(inputFile)
        val converted = converter.convert(rawData, format)
        val thumbnail = generator.generate(converted)

        println("변환 완료: $converted, 썸네일 : $thumbnail")
        return converted
    }
}