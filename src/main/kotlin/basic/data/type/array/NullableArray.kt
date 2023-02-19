package basic.data.type.array

fun main() {

    // By default, we can't store null value inside an array
    // But, we can tell kotlin that an array my store null values
    // To do this, use ? after the Array type declaration
    var names: Array<String?> = arrayOfNulls(3)
    names[0] = "Fadhli"
    names[1] = null
    names[2] = "Syaifullah"

}