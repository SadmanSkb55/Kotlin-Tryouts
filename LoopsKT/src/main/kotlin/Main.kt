fun main(args: Array<String>) {
   println("Enter a range")
    var r:Int?= readln().toInt()
    var i=10..r!!
    for ( x in i step 2){//step is like i++,i=i+n,i=i+2
        println(x)
    }
   // for(var k=10;k<=10;k++) wont work
    println("Enter anotehr range")
    var r1:Int?= readln().toInt()
    var i1=1 until r1!!
    for ( x in i1.reversed() ){//step isnt mandatory if u dont use
        println(x)
    }
    println("Enter anotehr 2nd range")
    var r2:Int?= readln().toInt()
    var i2=100 downTo  r2!!
    for ( x in i2 step 5){
        println(x)
    }
    println("Count is "+i2.count())
    println("Enter a character")
    var rs: String? = readln()
    var rx:Char?=rs?.get(0)

    var c='A'..rx!!
    val cx= c.toList().shuffled()
    for (f in cx.reversed()){
        println(f)
    }

}