open class childClass(x: Int) :dadClass(x) {
    var save:Int=x!!
    constructor() : this(0) {
        this.save=save
    }


    fun count(){
        var saveP:Int=save++
        println("Now $saveP")

        var pass=dadClass(saveP)
    }

    override fun generate() {
        super.generate()
    }
}