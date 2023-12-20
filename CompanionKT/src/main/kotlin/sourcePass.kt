class sourcePass(b:Int):printer {
    var x:Int?=b
    override fun prn() {
        println("Value is $x")
        printAll.vals.add(sourceD(x!!))
    }


}