package design_pattern.behavior.template_method

class DrawApplication : Application() {
    override fun canOpenDocument(name: String): Boolean {
        return name.endsWith(".draw")
    }

    override fun doCreateDocument(): Document? {
        println("DrawDocument 인스턴스를 생성합니다")
        return DrawDocument()
    }

    override fun aboutToOpenDocument(document: Document) {
        println("문서를 열기 전 준비 작업 수행 중...")
    }
}