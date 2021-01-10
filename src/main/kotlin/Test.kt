fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    sayHello("Hey","Kotlin")

    print("Enter: ")

    val intInput = readLine()!!.toInt()
    println("You entered: $intInput")
    val listOfPeople = mutableListOf<String>()
    for (i in 1..intInput) {
        val person = readLine()!!
        listOfPeople.add(person)
    }
    val newList = listOfPeople.shuffled()
    val result = List(2) { mutableListOf<String>() }
    newList.forEachIndexed { index, item -> result[index % 2].add(item) }
    println(result)

}
