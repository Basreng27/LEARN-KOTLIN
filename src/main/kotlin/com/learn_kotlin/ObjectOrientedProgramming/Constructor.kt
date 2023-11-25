// 4

//Primary Constructor
fun main(){
    val dicodingCat = AnimalConstructor("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//Init block
    val dicodingCatInit = AnimalInit("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCatInit.name}, Berat: ${dicodingCatInit.weight}, Umur: ${dicodingCatInit.age}, mamalia: ${dicodingCatInit.isMammal}")

//Secondary Constructor
    val dicodingCatSecondary = AnimalSecondary("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCatSecondary.name}, Berat: ${dicodingCatSecondary.weight}, Umur: ${dicodingCatSecondary.age}, mamalia: ${dicodingCatSecondary.isMammal}")

    val dicodingBird = AnimalSecondary("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")

}

//nilai default
class AnimalConstructor(val name: String, val weight: Double, val age: Int = 0, val isMammal: Boolean)

//Init block
class AnimalInit(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }

    // jika ingin namanya sama pakai this
//    init {
//        this.weight = if(weight < 0) 0.1 else weight
//        this.age = if(age < 0) 0  else age
//        this.name = name
//        this.isMammal = isMammal
//    }
}

//Secondary Constructor
class AnimalSecondary(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}
