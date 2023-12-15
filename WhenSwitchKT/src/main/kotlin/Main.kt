fun main(args: Array<String>) {
    println("Enter a int within 5")
   var x:Int?= readln().toInt()
    var y:String?=null

   var str= when(x){
        1-> {println("Hello")
        println("Reply")
            var msg:String?= readln().toString()
        }
        2-> {println("Hi")
            println("Reply")
            var msg:String?= readln().toString()
        }
        3-> {println("wyd")
            println("Reply")
            var msg:String?= readln().toString()
        }
        4-> {println("gg")
            println("Reply")
            var msg:String?= readln().toString()
        }
        5-> { "bruh"
            println("Reply")
            var msg:String?= readln().toString()
        }
        else-> println("out of bound")
    }
println("Str is $str")
}