fun main(){
    // boolean berisi perintah yang isinya "and" dan "or" dan "not or" dan "not"
    // dengan menggunakan simbol "&&" untuk "and" dan "||" untuk "or" dan "!=" untuk "not or" dan "!" untuk "not"

//  and
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    // untuk sederhananya
    // val isOpen = now >= officeOpen && now <= officeClosed
    print("Office is open : $isOpen")

//  or
    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")

//  not
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}