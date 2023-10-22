// 2

fun main(){
    // pemanggilan fungsi
    // bioData("","")
    println(bioData("Rayandra",22))
}

// deklarasi function
//fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
//    return result
//}
// pembuatan function
fun bioData(name:String, age:Int): String{
    return  "Nama : $name\n Usia : $age Tahun"
}
// jika hanyamengembalikan 1 baris bisa menggunakan fungsi cepat, seperti ini :
// fun setUser(name: String, age: Int): String = "Your name is $name, and you $age years old"
// atau seperti ini :
// fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
// jika tidak ingin mengembalikan nilai bisa seperi ini :
//fun printUser(name: String): Unit {
//    print("Your name is $name")
//}