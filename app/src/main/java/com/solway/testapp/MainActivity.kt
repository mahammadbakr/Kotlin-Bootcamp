package com.solway.testapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        // get today of the week days
        fun dayOfWeek() {
            println("What day is it today?")
            val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
            println( when (day) {
                1 -> "Sunday"
                2 -> "Monday"
                3 -> "Tuesday"
                4 -> "Wednesday"
                5 -> "Thursday"
                6 -> "Friday"
                7 -> "Saturday"
                else -> "Time has stopped"
            })
        }
        dayOfWeek()

        //another example
        fun getFortuneCookie() : String {
            val fortunes = listOf( "You will have a great day!",
                    "Things will go well for you today.",
                    "Enjoy a wonderful day of success.",
                    "Be humble and all will turn out well.",
                    "Today is a good day for exercising restraint.",
                    "Take it easy and enjoy life!",
                    "Treasure your friends, because they are your greatest fortune.")
            print("\nEnter your birthday: ")
            val birthday = readLine()?.toIntOrNull() ?: 1
            return fortunes[birthday.rem(fortunes.size)]
        }
        println("\nYour fortune is: ${getFortuneCookie()}")


        //default value argument in kotlin [ same as dart ]
        fun swimming(speed: String = "fast"){
            println(speed)
        }
        swimming()  //it print fast because no argument input and fast is default value argument
        swimming(speed = "slow")  //or you can give it a value instead


        //#### SECTION 3 ###############################################################

    }
}