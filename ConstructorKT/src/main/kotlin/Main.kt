fun main(args: Array<String>) {
println("Enter a Integer")
    var p:Int?= readln().toInt()
    var cls=Checker(p!!,)
    cls.ch()
    println("Enter a integer")
    var p2:Int?= readln().toInt()
    var cls2=Checker(p!!,p2!!)
    cls2.ch2()
    println("Enter int for 2nd class")
    var r:Int= readln().toInt()
    var cls3=CheckerI(r!!)
    println(cls3.compare())
    println("Enter int for 2nd class")
    var r2:Int= readln().toInt()
    var cls4=CheckerI(r!!,r2!!)
    println(cls4.compare())

}