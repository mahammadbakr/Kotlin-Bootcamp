package com.solway.testapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Math.random
import java.util.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //#### SECTION 1 ###############################################################

//        //example of Arrays in Kotlin
//        val list1 = mutableListOf("hama0","hama1","hama2")
//        println("printeddd1:"+list1[1])
//
//        val list2 = listOf("hama0","hama1","hama2")
//        println("printeddd2:"+list2[1])
//
//        val list3 = arrayOf("hama0","hama1","hama2")
//        println("printeddd3:"+list3[1])
//
//        val list4 = intArrayOf(1,2,3,4,5,6)
//        println("printeddd3:"+list4[1])
//
//
//        //example of Nested Arrays in Kotlin
//        val nestedArray = arrayOf("hama11","hama12","hama13",arrayOf("hama21","hama22","hama23"))
//        //note: import this =>   import java.util.*
//        println(Arrays.toString(nestedArray))
//
//
//        //example of Arrays with fixed size and times * in Kotlin
//         val timesTwoArray = Array(5) {it * 2}
//         println(timesTwoArray.toList())
//
//
//        //example of Loops in Kotlin
//       for(element in list4) println(element)
//
//       for(i in 'a'..'z') println(i)
//
//       for(i in 1..20) println(i)
//
//        //bytes and loop
//        val array = Array(7){1000.0.pow(it)}
//        val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
//                "terabyte", "petabyte", "exabyte")
//        for ((i, value) in array.withIndex()) {
//            println("1 ${sizes[i]} = ${value.toLong()} bytes")
//        }


        //#### SECTION 2 ###############################################################

//        // get today of the week days
//        fun dayOfWeek() {
//            println("What day is it today?")
//            val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
//            println( when (day) {
//                1 -> "Sunday"
//                2 -> "Monday"
//                3 -> "Tuesday"
//                4 -> "Wednesday"
//                5 -> "Thursday"
//                6 -> "Friday"
//                7 -> "Saturday"
//                else -> "Time has stopped"
//            })
//        }
//        dayOfWeek()
//
//        //another example
//        fun getFortuneCookie() : String {
//            val fortunes = listOf( "You will have a great day!",
//                    "Things will go well for you today.",
//                    "Enjoy a wonderful day of success.",
//                    "Be humble and all will turn out well.",
//                    "Today is a good day for exercising restraint.",
//                    "Take it easy and enjoy life!",
//                    "Treasure your friends, because they are your greatest fortune.")
//            print("\nEnter your birthday: ")
//            val birthday = readLine()?.toIntOrNull() ?: 1
//            return fortunes[birthday.rem(fortunes.size)]
//        }
//        println("\nYour fortune is: ${getFortuneCookie()}")
//
//
//        //default value argument in kotlin [ same as dart ]
//        fun swimming(speed: String = "fast"){
//            println(speed)
//        }
//        swimming()  //it print fast because no argument input and fast is default value argument
//        swimming(speed = "slow")  //or you can give it a value instead


        //#### SECTION 3 ###############################################################

//
//
//        //methods and expressions short way in Kotlin (Amazing)
//        fun isTooHot(temperature: Int) = temperature > 30
//        println(isTooHot(20)) // return false
//
//        fun isDirty(dirty: Int) = dirty > 30
//        println(isDirty(20)) // return false
//
//        fun isSunday(day: String) = day == "sunday"
//        println(isSunday("sunday")) // return true
//
//
//
//        //  some other expressions
//        fun isVeryHot (temperature: Int) = temperature > 35
//        fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
//                mood == "sad" && weather == "rainy" && temperature == 0
//        fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
//        fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
//            return when {
//                isVeryHot(temperature) -> "go swimming"
//                isSadRainyCold(mood, weather, temperature) -> "stay in bed"
//                isHappySunny(mood, weather) -> "go for a walk"
//                else -> "Stay home and read."
//            }
//        }
//
//        println(whatShouldIDoToday("happy", "sunny"))
//        println(whatShouldIDoToday("sad"))
//        print("How do you feel?")
//        println(whatShouldIDoToday(readLine()!!))
//
//
//        // Filtering in Kotlin
//
//        val listForFilter = arrayOf("hama0","bama","mama","haba", "mimo", "mrawi")
//        println(listForFilter.filter { true })  //return all
//        println(listForFilter.filter { it[0] == 'h' })  //return [hama0, haba]
//        println(listForFilter.filter { it[0] == 'm' })  //return [mama, mimo, mrawi]
//
//
//        //Random values in Kotlin
//        fun randomDay () :String {
//            val daysOfWeek = arrayOf("saturday","sunday","monday","tuesday","wednesday", "thursday", "friday")
//            return  daysOfWeek[Random().nextInt(7)]
//        }
//        println(randomDay())


        //#### SECTION 4 ###############################################################

//
//        // Lazy Filters in Kotlin
//        val listForFilter = arrayOf("hama0", "bama", "mama", "haba", "mimo", "mrawi")
//        println(listForFilter.asSequence().filter { it[0] == 'h' })  //return [hama0, haba]
//
//
//        //some other filters
//        val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
//
//        println(spices.filter { it.contains("curry") }.sortedBy { it.length })
//        println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })  //output = [cayenne]
//        println(spices.filter { it.startsWith('c') && it.endsWith('e') })  //output = [cayenne]
//
//        //Filtering the first 3 items by 'c'
//        println(spices.take(3).filter{it.startsWith('c')}) //output [curry, cayenne]
//
//
//        // Lambdas in Kotlin
//
//        val ride = { println("Ride \n") } //without parameter
//        ride()
//        val swim = {s:String -> println(s) } //with parameter String
//        swim("s")
//
//
//       // Use Lambda in a Useful way
//
//        val random1 = random()
//        val random2 = {random()}
//
//        /*
//        -random1 has a value assigned at compile time, and the value never changes when the variable is accessed.
//        -random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.
//        */
//
//        fun gamePlay(diceRoll: Int){
//            // do something with the dice roll
//            println(diceRoll)
//        }
//        gamePlay(4)


        //#### SECTION 5 ###############################################################


//       // classes in Kotlin
//        class Person(_firstName: String = "UNKNOWN", _age: Int = 0) {
//            val firstName = _firstName.capitalize()
//            var age = _age
//            // initializer block (constructor)
//            init {
//                println("First Name = $firstName")
//                println("Age = $age\n")
//            }
//        }
//        println("person1 is instantiated")
//        val person1 = Person("joe", 25)
//        println("person2 is instantiated")
//        val person2 = Person("Jack")
//
//        // in classes we have another type of constructor  (secondary)
//
//        open class Log {
//            var data: String = ""
//            var numberOfData = 0
//            constructor(_data: String) {
//
//            }
//            //here it is constructor
//            constructor(_data: String, _numberOfData: Int) {
//                data = _data
//                numberOfData = _numberOfData
//                println("$data: $numberOfData times")
//            }
//        }
//
//        class AuthLog: Log {
//            constructor(_data: String): this("From AuthLog -> " + _data, 10) {
//            }
//
//            constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
//            }
//        }
//
//        val p1 = AuthLog("Bad Password")


        //#### SECTION 6 ###############################################################

//
//        // Kotlin Inheritance with examples (overriding)
//        open class Animal() {
//            open var colour: String = "White"
//        }
//
//        class Dog : Animal() {
//            //override must be done
//            override var colour: String = "Black"
//            fun sound() {
//                println("Dog makes a sound of woof woof")
//            }
//        }
//
//        val d = Dog()
//        println("${d.sound()}")
//
//
//        // another example of  Inheritance
//        open class Book(val title: String, val author: String) {
//
//            private var currentPage = 1
//
//            open fun readPage() {
//                currentPage++
//            }
//        }
//
//        class EBook(title: String, author: String, var format: String = "text") : Book(title, author) {
//
//            private var wordsRead = 0
//
//            override fun readPage() {
//                wordsRead = wordsRead + 250
//            }
//        }
//
//        val eBook = EBook("title here", "Mohammed Bakr", "here text")
//        println("${eBook.readPage()}")
//
//
        //#### SECTION 7 ###############################################################



//        //Interfaces in Kotlin
//
//        abstract class CoverBook {
//            abstract val coverType: String
//        }
//
//        class Wood : CoverBook() {
//            override val coverType: String
//                get() = "WOOD"
//        }
//
//        class Fiber : CoverBook() {
//            override val coverType: String
//                get() = "Fiber"
//        }
//
//
//        // Data Classes in Kotlin
//        // Data classes are used for Creating objects that only have properties without additional functionality.
//
//        data class BookContainer(var book: EBook) {
//            val label = book.author
//        }
//
//        val spiceCabinet = listOf(BookContainer(EBook("Handle", "Nilson")),
//                BookContainer(EBook(" Curry", "Bright")))
//        for (element in spiceCabinet) println(element.label)
//



        //#### SECTION 8 ###############################################################


        //Pairs in Kotlin
//
//        val pairs = "Real" to "Barca" to "bayren" to "Attlatico"
//        println(pairs)
//
//
//        //full example of Pairs in kotlin
//        class Book(val title: String, val author: String, val year: Int) {
//
//            fun getTitleAuthor(): Pair<String, String> {
//                return (title to author)
//            }
//
//            fun getTitleAuthorYear(): Triple<String, String, Int> {
//                return Triple(title, author, year)
//            }
//        }
//
//        val book = Book("Romeon and Juliet", "William Shakespeare", 1597)
//        val bookTitleAuthor = book.getTitleAuthor()
//        val bookTitleAuthorYear = book.getTitleAuthorYear()
//        println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")
//        println("Here is your book ${bookTitleAuthorYear.first} " +
//                "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")
//
//
//        //collections in kotlin
//
//        val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
//        val library = mapOf("Shakespeare" to allBooks)
//        println(library.any { it.value.contains("Hamlet") })
//
//        val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
//        moreBooks.getOrPut("Jungle Book") { "Kipling" }
//        moreBooks.getOrPut("Hamlet") { "Shakespeare" }
//        println(moreBooks)
//
//
//
//        //#### SECTION 9 ###############################################################
//
//
//
//        //Const & Val Difference
//
//        val size = 20    // val will not change after assign but it assign during program execution
//        //const val size= 20    // const is also can't change after assign but it will assign during compile the code
//
//        //reguler object
//        object Constants {
//            //assign constants here
//            const val size= 20
//        }
//        //copanion object (used inside classes)
//          companion object Constants {
//            //assign constants here
//            const val size= 20
//          }



        //Extension Functions (Important)


        //example of extension function

//        class Student{
//            fun isPassed(mark: Int): Boolean{
//                return mark>40
//            }
//        }
//        fun Student.isExcellent(mark: Int): Boolean{
//            return mark > 90
//        }
//        val student = Student()
//        val passingStatus = student.isPassed(55)
//        println("student passing status is $passingStatus")
//        val excellentStatus = student.isExcellent(95)
//        println("student excellent status is $excellentStatus")
//
//       //usefull example
//        fun MutableList<Int>.swaap(index1: Int, index2: Int):MutableList<Int> {
//            val tmp = this[index1] // 'this' represents to the list
//            this[index1] = this[index2]
//            this[index2] = tmp
//            return this
//        }
//        val list = mutableListOf(5,10,15)
//        println("before swapping the list :$list")
//        val result = list.swaap(0, 2)
//        println("after swapping the list :$result")


        //#### SECTION 10 ###############################################################


//        // Full example of Generic Classes
//        open class BaseBuildingMaterial() {
//            open val numberNeeded = 1
//        }
//
//        class Wood : BaseBuildingMaterial() {
//            override val numberNeeded = 4
//        }
//
//        class Brick : BaseBuildingMaterial() {
//            override val numberNeeded = 8
//        }
//
//        class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {
//
//            val baseMaterialsNeeded = 100
//            val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded
//
//            fun build() {
//                println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
//            }
//        }
//        Building(Wood()).build()
//
//
//        // inline + reified  in Kotlin
//
//
//        // without reified type
//        fun <T> String.toKotlinObject(): T {
//            val mapper = jacksonObjectMapper()
//            //does not compile!
//            return mapper.readValue(this, T::class.java)
//        }
//
//        //with explicit Class parameter
//        fun <T: Any> String.toKotlinObject(c: KClass<T>): T {
//            val mapper = jacksonObjectMapper()
//            return mapper.readValue(this, c.java)
//        }
//
//        //with reified type
//        inline fun <reified T: Any> String.toKotlinObject(): T {
//            val mapper = jacksonObjectMapper()
//            return mapper.readValue(this, T::class.java)
//        }


        //#### SECTION 11 ###############################################################





    }

}