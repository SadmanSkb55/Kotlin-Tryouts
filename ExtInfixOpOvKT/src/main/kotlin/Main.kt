fun main(args: Array<String>) {
println("Enter first name")
    var fn=Something()
    fn.name= readln().toString()
    println("Enter Last name")
    var ln=Something()
    ln.name= readln().toString()

    var fullname=fn.plus(ln)//for extension function
    var flippedFullname=ln plus fn//for infix
    var flipperZ=fullname + flippedFullname//for operator overload

    fullname.show()
    flippedFullname.show()
    flipperZ.show()
}
operator infix fun Something.plus(a:Something):Something{
var newname=Something()
    newname.name=this.name+" "+a.name
    return newname
}