open class dadClass(var x:Int) {
    var c:Int=x!!
    init{
        this.c=c
    }


   open fun generate(){
        if (c>0){
            println("Can generate")
            var pass=childClass(c!!)
        }
        else{
            println("Can't generate")
        }
    }


}