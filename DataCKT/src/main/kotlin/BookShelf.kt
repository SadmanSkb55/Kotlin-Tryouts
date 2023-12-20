object BookShelf {
    var books= arrayListOf<Books>()
    fun showBooks(){
        for (i in books)
            println(i)
    }
}