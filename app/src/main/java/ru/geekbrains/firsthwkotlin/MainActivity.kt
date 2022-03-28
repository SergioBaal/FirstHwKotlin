package ru.geekbrains.firsthwkotlin

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testObjectOne = DataTest("Polo", 12)
        val testObjectTwo = testObjectOne.copy()
        val testObjectThree =
            testObjectOne.copy("Марко")//интересно, что в copy можно менять свойства.

        Log.d("myLogs", "${testObjectTwo.toString()}")
        Log.d("myLogs", "${testObjectThree.toString()}")

        val text: TextView = findViewById(R.id.textView)

        val button = findViewById<Button>(R.id.button).setOnClickListener {
            text.text =
                "1 - ${testObjectOne.toString()}" + "\n2 - ${testObjectTwo.toString()}" + "\n3 - ${testObjectThree.toString()}"
        }

        Log.d("myLogs", "${DataBase.getTestIf()}") //Проверяем if, должно быть "Успех"
        Log.d("myLogs", "${DataBase.getTestWhen(TestEnum.test2)}") //Проверяем when, должно выйти "2"
        DataBase.getTestCycle()

    }
}


