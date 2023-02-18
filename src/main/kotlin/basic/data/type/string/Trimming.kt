package basic.data.type.string

fun main() {

    // By default, indents on multilines strings will still be stored in the value
    // If you don't want it, we can trim it to get rid of it
    var address: String = """
        Some Street No. 0
        Some Region, Some Country
    """.trimIndent()

    println(address)

}