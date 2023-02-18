package basic.data.type.number

fun main() {

    // Byte range: -128 upto 127
    var byte: Byte = 100
    println("byte value : " + byte)

    // Short range: -3278 upto 32767
    var short: Short = 1000
    println("short value : " + short)

    // Int range: -2,174,483,648 upto 2,174,483,647
    // We can use _ (underscore) as separator to make it easy to read
    var int: Int = 1_000_000_000
    println("int value : " + int)

    // Long range: -9,223,372,036,854,775,808 upto 9,223,372,036,854,775,807
    var long: Long = 1_000_000_000_000_000_000
    println("long value : " + long)

}