fun  main(){
//    var hewan = arrayOf("kambing","sapi","jerapah")
//    for (i in 2 downTo 0) {
//        println(hewan[i])
//        print(hewan[0])
//    }
//    for (i in 1 .. 10){
//        if (i + 2 == 1)
//            print(i)
//    }
    //until prin tidak sampai batasan
    //downto dari perulangan besar ke keci

    //perulangan while
//    var a = 5
//    while (a >= 0){
//        a--
//        print(a)
//    }
//    var b = 0
//    while (b <= 5){
//        print(b)
//        b++
//    }
//    var i = 0
//    while (i <= 5){
//        i++
//        print(i)
//    }

    for (i in 1 .. 5){
        for (i in 1 .. 5){
            print("$i")
        }
        println()
    }
    for (i in 1 .. 5){
        for (j in 1 .. i){
            print("$j")
        }
        println()
    }

    for (i in 1 .. 5){
        for (j in 1 .. i){
            print("$j")
        }
        println()
    }
    for (i in 1 .. 5){
        for (j in 1 .. 3){
            print("$i")
        }
        println()
    }
    /**
     * buatlah sebuah array nilai 1-10
     * buatlah for untuk menampilkan nilai array tersebut
     *
     * jumlah satu2 nilai arraynya contoh : 1+2+3+4+5+6+7+8+9+10=.........pakai per ulangan for and while
     *
     * Tugas rumah
     * A.1 2 3 4 5
     *  1 2 3 4
     *  1 2 3
     *  1 2
     *  1
     * B.1 1 1 1
     * 2 2 2 2
     * 3 3 3 3
     * 4 4 4 4
     * 5 5 5 5
     * C.* 2 3 4*
     * 1*
     */

//    var angka = arrayOf(1,2,3,4,5,6,7,8,9,10)
//    for (i in angka){
//        print(i)
//    }
}