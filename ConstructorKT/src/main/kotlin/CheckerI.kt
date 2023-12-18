class CheckerI {
    var a:Int?=null
    var b:Int?=null
    constructor(a:Int,b:Int){
        this.a=a
        this.b=b
    }
    constructor(b: Int){
        this.b=b
        this.a=5
    }
    fun compare(): Int {
        if (a!!>b!!){
            return a!!
        }else
            return b!!
    }

}