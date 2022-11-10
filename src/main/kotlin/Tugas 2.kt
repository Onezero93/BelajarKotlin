fun main() {
    for (a in 1..10 step 1){
        print("$a ")
    }
    for (i in 5 downTo  1){
        for (j in 1 .. i){
            print("$j ")
        }
        println()
    }
    for (i in 1 .. 5){
        for (j in 1 .. 4){
            print("$i ")
        }
        println()
    }
    for (i in 1 .. 5){
        for (i in 1 .. 5){
            print("$i ")
        }
        println()
    }
}