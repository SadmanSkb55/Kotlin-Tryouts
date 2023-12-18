class Checker constructor(var x:Int) {//u can also write class Checker() //u can also write class Checker(var x:Int?=null)
    var c:Int?=x!!
    var y:Int?=null
    init {
        this.c=c
    }
    constructor(x:Int,y:Int):this(x){
        this.y=y
    }

    fun ch(){
       if (c!!>0)
           println("Positive is $c")
        else
            println("Negative is $c")
    }
    fun ch2(){
        if (c!!>y!!)
            println("$c big")
        else
            println("$y big")
    }

}