// 0

fun main(){
//    Tipe Data
    // pengidentifikasian variable
    // var identifier: Type = initialization
    // pembuatan variable di bagi 2 bisa menggunakan var atau val
    // va seperti const dalam php. nilainya tidak bisa dirubah
    var name: String = "Rayandra Wandi Marselana" //pembuatan variable
    // boleh juga di buat seperti ini
    // var name = "@Raywndii"
    name = "Wandi"

    println(name)

//    Char
    // penggunaan char harus di isi dengan petik satu '' jika menggunakan petik 2 akan dianggap String
    // hanya bisa di isi 1 character jika lebih maka error
    var karakter = 'A'
    // dengan tipe data char kita bisa menggunakan oprator increment dan decremnet
    println("Vocal " + karakter++)
    println("Vocal " + karakter++)
    println("Vocal " + karakter++)
    println("Vocal " + karakter--)
    println("Vocal " + karakter--)
    println("Vocal " + karakter--)
    println("Vocal " + karakter--)

//    String
    // dengan tipe data string kita bisa mengambil suatu nilai dari isi string tersebut dengan menggunakan "indexing"
    var textString = "Rayandra Wandi Marselana"
    val firstWord = textString[0] // mengambil Huruf "R"

    // memanggil variable dalam string menggunakan $
    println("Kata Pertama Dari $textString Adalah $firstWord")

    // looping isi var name
    // strucurnya nama = aliasnya dan name = variable yang di ulang
    for (nama in name){
        print(nama)
    }

    // jika ingin menambahkan kutip dua pada sting bisa menggunakan \
    val statement = "Kotlin is \"Awesome!\""
    // ada beberapa perintah lainnya seperti
    /*  \t: menambah tab ke dalam teks.
        \n: membuat baris baru di dalam teks.
        \’: menambah karakter single quote kedalam teks.
        \”: menambah karakter double quote kedalam teks.
        \\: menambah karakter backslash kedalam teks. */

    // untuk membuat line yang mempunyai baris ersendiri bisa menggunakan """
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}