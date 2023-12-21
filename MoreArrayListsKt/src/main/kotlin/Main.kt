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
}