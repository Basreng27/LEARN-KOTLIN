// Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel

data class DataUsers(val name : String, val age : Int)

fun main(){
    val dataUsers = DataUsers("nrohmen", 17)
    // mengambil datanya menggunakan components()
    val name = dataUsers.component1()
    val age = dataUsers.component2()

    println("My name is $name, I am $age years old")

    // atau
    val dataUser = DataUsers("nrohmen", 17)
    val (name2, age2) = dataUser

    println("My name is $name2, I am $age2 years old")

    // pemanggilan fungsi di dataclass
    val dataUserss = DataUserss("nrohmen", 23)
    dataUserss.intro()
}

// pada dataclass bisa membuat fungsi seperti ini
data class DataUserss(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}