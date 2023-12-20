fun main(args: Array<String>) {
println("How many machines u want to take?")
    var c:Int?= readln().toInt()
    var r: IntRange =0..c!!
    for (i in r){
        println("Enter brand")
        var str:String?= readln().toString()
        println("Enter price")
        var prc:Int?= readln().toInt()
        var laptop=Dclass(str!!,prc!!)
        println(laptop)
    }
    var laptop=Dclass("Name",1000)
    var laptop2=Dclass("anme2",2000)
    println(laptop.equals(laptop2))
    var laptop3=laptop2.copy()
    var laptop4=laptop3.hashCode()//hashvalue
    println(laptop3)
    println(laptop4)

    BookShelf.books.add(Books("A",30))
    BookShelf.books.add(Books("b",300))
    BookShelf.books.add(Books("c",30000))

    BookShelf.showBooks()

}
