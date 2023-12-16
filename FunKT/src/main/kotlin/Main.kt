fun main() {
    println("Enter x")
    var x:Int?= readln().toInt()
    println("Enter y")
    var y:Int?= readln().toInt()
    var res=sum(x!!,y!!)
    var res2=sum2(x!!,y!!)
    sum3(x!!,y!!)
    var res3=sum4(x!!,y!!)
    var res4=calcAmount(a = x!!,b=y!!.toDouble())
    println("= $res")
    println("Substraction= "+res2)
    println("Division=$res3")
}
fun sum(a:Int,b:Int):Int{
    println("$a + $b")
    return a+b
}
fun sum2(a:Int,b:Int):Int=if(a>b){a-b}else{b-a}

fun sum3(a:Int,b:Int){
    var mul=a*b
    println("Multiplication= "+mul)
}
fun sum4(a:Int,b:Int):Double=if (a>b) (a.toDouble()/b) else (b as Double/a)
@JvmOverloads
    fun calcAmount(a:Int,b:Double=0.05):Int{
        return (a+a*b).toInt()
    }