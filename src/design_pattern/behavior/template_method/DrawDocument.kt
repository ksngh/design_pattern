package design_pattern.behavior.template_method

class DrawDocument : Document() {
    override fun doRead() {
        println("그림 문서를 읽는 중입니다...")
    }
}