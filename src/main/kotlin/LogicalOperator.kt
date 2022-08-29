fun main() {
    var above70 = false
    var knowsProg = false

    //&&  AND
    var calledForInterview = above70 && knowsProg
    println(calledForInterview)

    knowsProg  = true
    calledForInterview = above70 && knowsProg
    println(calledForInterview)

    // || OR

    calledForInterview = above70 || knowsProg
    println(calledForInterview)

    //short

    var i =10
    var j = 11
    var result: Boolean = i == 10 || j++ == 11
    println(i)
    println(j)
    println(result)

    //Not operator !
    //false ~
    //true ~
    val answer = false
    result = !(answer)
    println(result)



}