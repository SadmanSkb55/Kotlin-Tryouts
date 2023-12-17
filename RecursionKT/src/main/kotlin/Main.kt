import java.math.BigInteger
import kotlin.system.measureTimeMillis
fun main(args: Array<String>) {
    println("Enter a number for factorial (With Recursion)")

        var num: Int? = readln().toInt()
    val startTime = System.currentTimeMillis()
        var y: BigInteger = adder(num!!.toBigInteger(), BigInteger.ZERO)
        var x: BigInteger = conduct(num!!.toBigInteger(), BigInteger.ONE)
    val endTime = System.currentTimeMillis()
    val totalTimeInSeconds = (endTime - startTime) / 1000.0
        println("$num! = $x")
        val digitCount = countDigits(x)
        println("Digits: $digitCount")

    println("Time taken: $totalTimeInSeconds seconds")
}

tailrec fun conduct(a: BigInteger, res: BigInteger): BigInteger {
    return if (a == BigInteger.ZERO)
        res
    else{
        //println("Run conduct: $a")

        conduct(a - BigInteger.ONE, a * res)
    }
}
tailrec fun adder(b: BigInteger, c: BigInteger): BigInteger {
    return if (c < b) {
       // println("Run adder: $c")
        adder(b, c + BigInteger.ONE)

    } else {
        c
    }
}
fun countDigits(number: BigInteger): Int {
    return number.toString().length
}
