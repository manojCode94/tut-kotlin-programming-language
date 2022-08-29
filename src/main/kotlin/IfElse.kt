fun main(){
    val isRainging:Boolean = true
    if(isRainging) {
        println("tacke umbrella")
    } else {
        println("No rain !!!!")
    }

    val x:Int = 10
    val y:Int = 11
    if(x > y) {
        println("x is greater")
    }
    else if(x < y) {println("y is greater")} else {
        println("x == y")
    }

    //In kotlin way if else as expression instead of ternary operator
    val result = if(x > y) {
        ("x is greater")
    }
    else if(x < y) {
        ("y is greater")
    } else {
        ("x == y")
    }
    println(result.toString())

    var number = 20
    var result2 = if(number % 2 == 0) {"even"} else {"odd"}
    println(result2)
}