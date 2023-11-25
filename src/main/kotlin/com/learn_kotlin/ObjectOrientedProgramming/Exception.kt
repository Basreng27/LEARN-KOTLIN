// 11

//Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program. Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita. Berikut ini beberapa contoh Unchecked Exception yang sering mengganggu jalannya program kita:
//ArithmeticException
//NumberFormatException
//NullPointerException
//ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol. Berikut merupakan contoh kode yang dapat membangkitkan

//Handling
fun main() {
//try-catch
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

//try-catch-finally
    lateinit var someMustNotNullValueF: String
    try {
        someMustNotNullValueF = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValueF = "Nilai String Null"
    } finally {
        println(someMustNotNullValueF)
    }

//Multiple Catch
    val someStringValue: String? = null
    var someIntValue: Int = 0
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}