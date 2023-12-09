import java.util.*
fun main() {
    //using java import
  //var x:Int
 //var y:Int
   // var z=0
  println("Enter x")
    var x:Int?=Scanner(System.`in`).nextInt()//to insert a  value directly without pass...u must not mention it before

    println("Enter Y")
    var sc:Int?=Scanner(System.`in`)?.nextInt()
   var y=sc; // u cant pass too...shit lang if ur fan of java c

        //var sc=Scanner(System.`in`)
 //  var y=sc //but u can do this

    // reason to happen this cause u might intsert another data type...to avoid it

//    println("Enter Z")
//   z=Scanner(System.`in`) Even if u initialize it before it will give a type mismatch

    println("Enter z")
    var z:Int?= readLine()?.toInt()
    println("enter f")
    var f:Int?= readln()?.toInt()

  //  var n=x+y+z here is the thing if u use java scanner.....it will need
//var n= f?.let { z?.plus(it) }
    val n= z!! + f!!
    var m= y!! + x!!
    println("Sum is $n")//it will give u string add
    println("From java addition is $m")
    val sum=n!!+m!!
    println("from both $sum ")
}




