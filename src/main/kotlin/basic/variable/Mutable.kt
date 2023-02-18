package basic.variable

fun main() {

    // Use the var keyword to declare a mutable variable
    var firstName: String = "Fadhli"

    // We don't need to specify the data type explicitly
    var lastName = "Syaifullah"

    // Mutable variables can be reassigned with values of the same data type
    var number = 0
    number = 1

    // We can also declare a mutable variable without value
    // In this case we must explicitly specify the data type of it
    var text: String
    text = "Something"

}