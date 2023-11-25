// 8

abstract class AnimalAbs(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
    fun eat(){
        println("$name sedang makan !")
    }
    fun sleep(){
        println("$name sedang tidur !")
    }
}


fun main(){
//    val animal = AnimalAbs("dicoding animal", 2.6, 1, true)
}

// Output: cannot create an instance of an abstract class