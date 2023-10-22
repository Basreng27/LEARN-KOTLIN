// 3

fun main(){
    val jamBuka = 7
    val sekarang = 20
    val kantor: String

    // if
    if (sekarang > jamBuka) {
        kantor = "Buka"
    } else if (sekarang == jamBuka) {
        kantor = "Wait a minute, office will be open"
    } else {
        kantor = "Tutup"
    }

    println(kantor)
}