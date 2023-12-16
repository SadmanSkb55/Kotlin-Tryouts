import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
       
        throw ExceptionCustom("This is a custom exception with a custom message!")
    } catch (e: ExceptionCustom) {
        println("Caught custom exception: ${e.message}")
        e.printStackTrace()
    }

    println("Enter a Number")
   var str:String?= readln().toString()
    try {
        var num:Int=str!!.toInt()
    }catch (e:Exception){
        println(e.message)
        e.printStackTrace()
    }
   finally {
       println("Cant convert")
   }
    println("Enter Another number")
    var strX:String?= readln().toString()
    var numx=try {
        strX!!.toInt()
    }catch (e:NumberFormatException){
        println(e.localizedMessage)
        -1
        e.printStackTrace()
    }
    println(numx)

    println("Enter a Numerator")
    var x:Double?= readln().toDouble()
    println("Enter a Denominator")
    var y:Double?= readln().toDouble()

    var res= runCatching {
        check(x!!>y!!) {
            x!! / y!!
        }
        check(y!!>x!!){
            y!!/x!!
        }
    }
    res.onFailure {
        it.printStackTrace()
        check(x!! > 0) { "Check failed: Value must be positive" }
        check(y!!> 0) { "Check failed: Value must be positive" }
    }
    var a= run {
        println("Enter A")
        readln().toDouble()
    }
    var b= run {
        println("Enter B")
        readln().toDouble()
    }
    val result: Result<Double> = runCatching {
        sum(a.toInt(),b.toInt())
    }
    result.let {
        println(it)
        println(result.getOrNull())
    }

}

@Throws(Exception::class)
fun sum(a:Int,b:Int):Double{
    if (b==0 && a==0){
        throw ArithmeticException("Div by 0")
    }
    else if (a>b){
        return a.toDouble()/b
    }else
        return b as Double/a
}
