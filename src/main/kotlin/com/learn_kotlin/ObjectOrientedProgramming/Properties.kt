// 3
import kotlin.reflect.KProperty

// properties seter dan geter
class Hewan{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    //getter = get data
    val dicodingCat = Hewan()
    println("Nama: ${dicodingCat.name}" )
    //setter = set data
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")

//    Property Delegation
    val animal = AnimalDelegation()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")

//    Extension Properties
    val dicodingCatExtension = AnimalExtension("Dicoding Miaw", 5.0, 2, true)

    println(dicodingCatExtension.getAnimalInfo)
}

//    Property Delegation
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class AnimalDelegation {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

//    Extension Properties
class AnimalExtension(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val AnimalExtension.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"