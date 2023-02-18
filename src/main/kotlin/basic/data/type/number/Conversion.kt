package basic.data.type.number

fun main() {

    var number: Int = 1_000_000_000

    // To convert a type of number into another one we can use built-in functions listed below:
    var byte: Byte = number.toByte()
    println("number " + number + " -> byte " + byte)

    var short: Short = number.toShort()
    println("number " + number + " -> short " + short)

    var int: Int = number.toInt()
    println("number " + number + " -> int " + int)

    var long: Long = number.toLong()
    println("number " + number + " -> long " + long)

    var float: Float = number.toFloat()
    println("number " + number + " -> float " + float)

    var double: Double = number.toDouble()
    println("number " + number + " -> double " + double)

}