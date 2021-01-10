fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")
//Split people into groups of all sizes randomly
fun main() {
    sayHello("Hey","Kotlin")

    print("Number of People: ")
    val intInput = readLine()!!.toInt()
    print("Number of Groups: ")
    val groupSize = readLine()!!.toInt()
    val listOfPeople = mutableListOf<String>()
    for (i in 1..intInput) {
        print("Enter Name $i: ")
        val person = readLine()!!
        listOfPeople.add(person)
    }
    val newList = listOfPeople.shuffled()
    val result = List(groupSize) { mutableListOf<String>() }
    newList.forEachIndexed { index, item -> result[index % groupSize].add(item) }
    result.forEach(::println)

}
