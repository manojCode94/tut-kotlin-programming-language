fun main(){
    //When
    var animal = "Dog"
    /*if(animal == "Horse") {
        println("Horse")
    } else if(animal == "Cat"){
        println("cat")
    } else if(animal == "Dog"){
        println("Dog")
    } else {
        println("Animal Not found")
    }*/

    //The if else ladder can be simplified with help of the When
    when(animal) {
        "Horse" -> {
            println("Horse")
        }
        "Cat" -> {
            println("Cat")
        }
        "Dog"->println("Dog")
        else -> println("Animal not found")
    }

    //We can use when as an expression as well
    var result =  when(animal) {
        "Horse" -> {
            ("Horse")
        }
        "Cat" -> {
            ("Cat")
        }
        "Dog"->{("Dog")}
        else -> {("Animal not found")}
    }
    println(result)

}