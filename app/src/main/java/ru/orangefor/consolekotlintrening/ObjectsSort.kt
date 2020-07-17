package ru.orangefor.consolekotlintrening

fun main() {
  val  objectsArray: Array<Person> = arrayOf(Person("вася", 7),
                                             Person("Лена", 6),
                                             Person("Саша", 5),
                                             Person("Гриша", 4),
                                             Person("Витя", 3))
    println("изначальная последовательность")
    for(person in objectsArray) println("${person.name} ${person.age}")

    val sortedMas = sortPersonMasByAge(objectsArray)

    println("сортированная последовательность")
    for(person in sortedMas) println("${person.name} ${person.age}")

}

fun sortPersonMasByAge(mas: Array<Person>): Array<Person>{
    while(true) {
        var kolIzm = 0
        for (i in 0 until mas.size-1) {
            if(mas[i].age > mas[i+1].age){
                val buf = mas[i]
                mas[i] = mas[i+1]
                mas[i+1] = buf
                kolIzm++

            }
        }
        if(kolIzm == 0) break
    }
    return mas
}

class Person(_name: String, _age: Int){
    val name = _name
    val age = _age
}