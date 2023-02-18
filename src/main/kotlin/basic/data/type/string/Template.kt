package basic.data.type.string

fun main() {

    var firstName: String = "Fadhli"
    println("first name : " + firstName)

    var lastName: String = "Syaifullah"
    println("last name : " + lastName)

    // We can access data from outside string value using $ expression
    var fullName: String = "$firstName $lastName"
    println("full name : " + fullName)

    // For complex expression we can use ${ expression }
    var firstNameDesc: String = "The first name is ${firstName.length} characters long"
    println(firstNameDesc)

}