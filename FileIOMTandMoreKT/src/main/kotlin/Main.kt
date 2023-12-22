import java.io.File
import java.io.FileReader
import java.io.FileWriter
import kotlin.coroutines.*

fun main(args: Array<String>) /*=runBlocking*/{
    println("enter a file name with file type")
    var nm:String?= readln().toString()
    println("Insert String")
    var str:String?= readln().toString()
    filew(nm!!,str!!)
    println("Enter the file name you want to read")
    var fn:String?= readln().toString()
    fileR(fn!!)

    val thread1 = Thread { printNumbers("Thread 1") }
    val thread2 = Thread { printNumbers("Thread 2") }

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

//    val job1 = launch { printNumber("Coroutine 1") }
//    val job2 = launch { printNumber("Coroutine 2") }
//
//    job1.join()
//    job2.join()
}
fun filew(fname:String,value :String){

    try {
        var fw=FileWriter(fname,true)
        fw.write(value+"\n")
        fw.close()
    }catch (e:Exception){
        e.printStackTrace()
    }
}
fun fileR(name:String){
    try {
        var fl=File(name)
        var fr=FileReader(name)
        if (!fl.exists()) {
            println("File $name does not exist.")
            return
        }
        fr.forEachLine { line ->
            println(line)
        }
        fr.close()
    }catch (e:Exception){
        e.printStackTrace()
    }
}
fun printNumbers(threadName: String) {
    for (i in 1..5) {
        println("$threadName: $i")
        Thread.sleep(100)
    }
}
//suspend fun printNumber(coroutineName: String) {
//    for (i in 1..5) {
//        println("$coroutineName: $i")
//        delay(100)
//    }
//}