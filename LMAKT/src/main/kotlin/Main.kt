import java.util.TreeMap

fun main(args: Array<String>) {
var num= listOf(1,2,3,4,5)
    for ((i,e) in num.withIndex()){ //here (i,e) works as two iterator...one is for index(builtin) and another is for acces of list
        println("$i : $e")
    }
    //or
    for (i in 0 until num.size){//same
        println("$i :"+num[i])
    }
    //list is immutable
    println(num[3])
    //array is mutable
    println("Enter the size of array")
    var s:Int?= readln().toInt()
    var arr=IntArray(s!!)
    for (i in 0 until s!!){//(i=0,i<=s,i++)
        println("Enter element")
        arr[i]= readln().toInt()
    }
    println("Enter number which u want to check on")
    println("1.Show all with index \n2.Search by index")
    var x:Int?= readln().toInt()
    when(x){
        1->{
            for ((i,e) in arr.withIndex()){
                println("$i : $e")

            }
            println(arr.size)
        }
        2->{
            println("Which one u want to see?")
            var src:Int?= readln().toInt()
            var ind=arr.indexOf(src!!)
            if (src!! in arr){
                println("Found $src in $ind ")
                println(arr[ind!!])
            }else
                println("Not found")
        }
        else-> println("Wrong insertion")
    }

//////map
    var variable=TreeMap<String,Int>()
    variable["Alex"]=100
    variable["black"]=200
    variable["Slack"]=300
    for((a,b) in variable ){
        println("$a is $b")
    }
    val ages: Map<String, Int> = mapOf(
        "Alice" to 25,
        "Bob" to 30,
        "Charlie" to 22
    )
    for((a,b) in ages ){
        println("$a is $b")
    }
    //maps are immutable too
    
}
