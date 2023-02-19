package basic.data.type.range

fun main() {

    // Sometimes we want to create an array that contains sequential numbers of data
    // Kotlin supports the range data type, which is used for needs like this
    // To create a range just use .. for ascending orders or downTo for descending orders
    var grades = 0..100
    var temperatures = 100 downTo 0

    // By default, each data in the range will be step by 1
    // But, we can specify how many steps we want
    var even = 0..100 step 2
    var odd = 100 downTo 0 step 3

}