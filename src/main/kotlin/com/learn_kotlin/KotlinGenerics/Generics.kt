// 1
// Kita bisa menerapkannya dengan meletakkan tipe parameter ke dalam angle brackets (<>) seperti berikut:
fun main() {
// Mendeklarasikan Kelas Generic
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)

// Constraint Type Parameter
//    val numbers = ListNumber<Long>()
//    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds

//    variance
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
}

//Mendeklarasikan Kelas Generic
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int): T
}

//Mendeklarasikan Fungsi Generic
//fun main() {
//    val numbers = (1..100).toList()
//    print(numbers.slice(1..10))
//}

//Constraint Type Parameter
//Dalam penerapan generic, kita bisa membatasi tipe apa saja yang dapat digunakan sebagai parameter. Untuk menentukkan batasan tersebut, bisa dengan menambahkan tanda titik dua (:) setelah tipe parameter yang kemudian diikuti oleh tipe yang akan dijadikan batasan. Contohnya seperti berikut:
//class ListNumber<T : Number> : List<T>{
//    override fun get(index: Int): T {
//        /* .. */
//    }
//}
//fun <T : Number> List<T>.sumNumber() : T {
//    /* .. */
//}
//class ListNumber<T : Number> : List<T>{
//    override fun get(index: Int): T {
//        /* .. */
//    }
//}

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

//Covariant
interface ListC<out E> : Collection<E> {
    operator fun get(index: Int): E
}

//Contravariant
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}