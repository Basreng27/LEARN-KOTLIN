// Class jika inngin memiliki fungsi equals seperti data class
class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

// Dara Class
data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user) // User@4d7e1886
    println(dataUser) // DataUser(name=nrohmen, age=17)

    // class data memiliki fungsi utuk mengetahui data sama atau tidak
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = DataUser("nrohmen", 17)

    println(dataUser4.equals(dataUser2))
    println(dataUser4.equals(dataUser3))
}