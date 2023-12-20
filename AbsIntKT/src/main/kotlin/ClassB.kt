class ClassB: ClassA(),B{
    override fun runner() {
        println("GG")
    }

    override fun disp() {
        println("display")
    }

    override fun show() {
        println("show")
    }

    override fun showT() {
        super<ClassA>.showT()
        super<B>.showT()
    }

}