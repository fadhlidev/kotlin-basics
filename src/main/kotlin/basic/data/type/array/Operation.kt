package basic.data.type.array

fun main() {

    // Every data in the array is stored in an index, starting with index 0
    // Index:                              0           1
    var names: Array<String> = arrayOf("Fadhli", "Syaifullah")

    // To access and modify data inside the array we can use get and set methods
    println(names.get(0))
    names.set(0, "FADHLI")
    println(names.get(0))

    // Alternatively we can use [index] to access or modify the data directly
    println(names[1])
    names[1] = "SYAIFULLAH"
    println(names[1])

}