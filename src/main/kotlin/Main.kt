fun main(args: Array<String>) {
    val nama : String = "iqbal"
    val umur : Int = 20
    var sekolah = "Universitas Nurul Jadid"
    var alamat : String = "probolinggo"
    var golonganDarah ='B'

    print(nama);
    println(alamat)
    print("nama saya $nama,umur saya $umur,\nsaya dari $sekolah,alamat saya $alamat,golongan darah $golonganDarah")

    //percabangan
    var nilaiA = 30
    var nilaiB = 20

    if (nilaiA<nilaiB){
        println("salah")
    }else{
        println("benar")

    }

    var number = 30

    if (nilaiA<0){
        println("positif")
    }else{
        println("negatif")

    }


    var nomorA = 25
    var numberB = 20

    if (nomorA==2){
        println("genap")
    }else{
        println("ganjil")

    }
}