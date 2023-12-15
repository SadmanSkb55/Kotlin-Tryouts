fun main(args: Array<String>) {
   var a:Int?=null
    var b:Int?=null
    println("enter a")
    a= readln().toInt()
    println("Enter b")
    b= readln().toInt()
    var r=if (a>b && b!=0) //u can also do if(..) var r=a or b whatever ,just make r null or initialized
        a
    else if (b>a && a!=0)
        b
 else
  println("Nill")
    println(r)
    var str=StringComp()
    println("Enter a string")
    str.str1= readLine() .toString()
    println(str.str1?.length)
 var strx=str.str1
    println("Enter another string")
    str.str2= readLine().toString()
    println(str.str2?.length)
 var stry=str.str2
 if (strx.equals(stry))
  println("Same")
 else
  println("Nah")

}