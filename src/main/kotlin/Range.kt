fun main(){
    //Range
    val number = 10
    // number in 1 .. 5 // the upper bound is included
    var result = number in 1..5// 1,2,3,4,5
    println(result)

    result = number in 1 until 5 // the upper bound is not included here
    println(result)
}