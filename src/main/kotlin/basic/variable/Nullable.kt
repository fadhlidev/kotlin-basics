package basic.variable

fun main() {

    // By default, a variable can't be null
    // But, we can tell kotlin that a variable may be null
    // To do this, use ? after the type declaration
    var name: String? = null
    println(name)
    println(name?.length)

    name = "Fadhli Syaifullah"
    println(name)
    println(name.length)

}