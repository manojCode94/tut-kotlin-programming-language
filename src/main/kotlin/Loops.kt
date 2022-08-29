fun main(){
    //loops
    var count = 5
    //while loop
    while(count >= 1) {
        println("Hello !")
        count--
    }

    //print 2 tables
    var num = 2
    var i = 1
    while (i <= 10){
        println(num * i)
        i++;
    }
    println("Outside the loop " + i)

    //do while
    i = 5
    do {
        println("Hello")
        i--
    } while (i > 0)
}