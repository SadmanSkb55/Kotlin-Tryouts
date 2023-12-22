import java.util.function.Consumer

fun main(args: Array<String>) {

    println("Enter values,while  you insert 0,input will be stopped")
    var i=0
    var nums= mutableListOf<Int>()

   while (true){
       println("Enter value no.$i")
       var insert= readLine()?.toIntOrNull() ?: 0
       if (insert==0){
            break
       }else{
           //inputList.add(userInput)
           nums.add(insert)
       i++
       }
   }
    var size=nums.size
    println("Size of mutable list $size")
    println("From mutable list")
    println("Entered numbers: ${nums.joinToString(", ")}")
    val arraynums = nums.toIntArray()
   // val array2 = nums.toIntArray()
    println("Size of array ${arraynums.size}")
    println("From array")
    for (i in arraynums){
        print(" $i,")
    }
        println()
    print("Enter the size of the array: ")
    val size2 = readLine()?.toIntOrNull() ?: 0

    val array = IntArray(size2)

    for (i in 0 until size2) {
        print("Enter element at index $i: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    println("Entered array: ${array.joinToString(", ")}")
 var array2= intArrayOf(6,9,0,9,7,6,4)//not mutable
//    var c=0
//   while (true){
//        println("Enter number of $c")
//       var x:Int?= readln().toInt()
//       if (x==0)
//           break
//       else
//           array2[c]=x!!
//       c++
//    }
    println("Size of 3rd array ${array2.size}")
        println("Last digit ${array2.last()}")
    println("all : ${array2.joinToString(", ")}")
    println("Enter which index u want to change within size ${array2.size}")
    var a:Int?= readln().toInt()
    println("Enter the value")
    var b:Int?= readln().toInt()
    array2.set(a!!,b!!)
    println("new : ${array2.joinToString(", ")}")

    println()
    println("Enter size")
    var u:Int?= readln().toInt()
    var str= arrayOfNulls<String>(u!!)
    println("now : ${str.joinToString(", ")}")
    println("Enter which index u want to change within size ${array2.size}")
    var a2:Int?= readln().toInt()
    println("Enter the value")
    var b2:Int?= readln().toInt()
    str.set(a2!!,b2!!.toString())
    println("new : ${str.joinToString(", ")}")

    var vals= listOf(null,null)//immutable

    var info:List<Data> = listOf<Data>(Data("a",20),Data("Name",0))
    for(i in info){
        println(i.name+" "+i.id)
    }
   println()
   // var info2: List<Data> = mutableListOf<Data>(Data(x,7)) immutable

   println("Enter the value how much u want to enter")
    var info2: MutableList<Data> = mutableListOf<Data>()
   var lim:Int?= readln().toInt()
    for (i in 0 until lim!!) {
        println("Enter name")
        var A: String? = readln().toString()
        println("Enter the ID")
        var B: Int? = readln().toInt()
        info2.add(Data(A ?: "", B ?: 0))
      }
    for (data in info2) {
        println("${data.name} ${data.id}")
    }
 var infox= listOf<Int>(1,2,3,4,5,6,7,8,9)
    var con:Consumer<Int> = object :Consumer<Int>{
        override fun accept(t: Int) {
           println(t)
        }
    }
 var evens=infox.filter { it%2==0 }
    var doublevalues=infox.map { it*2 }
     infox.forEach({n-> println(n) })
    evens.forEach({println(it)})
    doublevalues.forEach(::println)
var res=infox.filter { it%2==0 }.map { it*2 }
res.forEach { println(it) }
    }
