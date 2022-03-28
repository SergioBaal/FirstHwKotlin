package ru.geekbrains.firsthwkotlin

import android.util.Log

data class DataTest(val name: String, val age: Int)


enum class TestEnum {
    test1,
    test2,
    test3,
    test4
}

object DataBase {


    fun getTestIf(): String {

        return if ((2 + 2) == 4) {
            "Test successful"
        } else {
            "Оруэлла на вас нет!"
        }
    }

//        val result = if ((2 * 2 == 4)) {
//            "Test successful"
//        } else {
//            "Оруэлла на вас нет!"
//        }
//        return result
//    }


    fun getTestWhen(input: TestEnum): String {

        return when (input) {
            TestEnum.test1 -> "1"
            TestEnum.test2 -> "2"
            TestEnum.test3 -> "3"
            TestEnum.test4 -> "4"
        }
    }

    fun getTestCycle() {
        val list = listOf(1, 2, 3)
        for (one in list) {
            Log.d("myLogs", "$one Проверка цикла#1")
        }

        list.forEach {
            Log.d("myLogs", "$it Проверка цикла#2")
        }

        repeat(3){
            Log.d("myLogs", "$it Проверка цикла#3")
        }

        for (i in 1..3) {
            Log.d("myLogs", "$i Проверка цикла#4")
        }

        for (i in 1 until 3) {
            Log.d("myLogs", "$i Проверка цикла#5")
        }

        for (i in 3 downTo  1) {
            Log.d("myLogs", "$i Проверка цикла#6")
        }

        var counter = 3
        while (counter --> 0){
                Log.d("myLogs", "$counter Проверка цикла#7")
        }
        counter = 3
        do {
            Log.d("myLogs", "$counter Проверка цикла#8")
        }
        while (counter --> 0)

    }
}