package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.homeworks.HW14.Classes
import com.example.homeworks.HW14.Fibonachi
import com.example.homeworks.HW15.Task1.Wine
import com.example.homeworks.HW15.Task2.FixedPayment
import com.example.homeworks.HW15.Task2.HourlyPayment
import com.example.homeworks.HW15.Task2.Worker
import java.io.BufferedWriter
import java.io.File
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val wine = Wine("da", "Dsa", GregorianCalendar(1975, 11, 12), "asd")
        val hourlyworker = HourlyPayment("Gleb", 1234, "cook", 6.3)
        val fixedworker = FixedPayment("Lisa", 1253, "cashier", 1000.0)
        val fixedworker2 = FixedPayment("Nstya", 1921, "barmen", 1000.0)
        val list = mutableListOf(fixedworker, fixedworker2, hourlyworker)
        list.sortByDescending { it.payment }
        println(list.slice(0..5))
        println(list.slice(list.size - 4 until list.size))
        val writer =
            File("src/main/java/com/example/homeworks/HW15/Task2/output.txt").bufferedWriter()
        list.forEach {
            writer.write(it.toString())
            writer.newLine()
        }
        writer.close()



        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView).apply {
            text = list.toString()
        }
    }
}