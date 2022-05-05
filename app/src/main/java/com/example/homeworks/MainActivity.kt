package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.homeworks.HW14.Classes
import com.example.homeworks.HW14.Fibonachi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fibonachi = Fibonachi()
        val fib = fibonachi.fibonachi()
        val classes = Classes()
        classes.generation()
        val heirExample = Classes.util(classes.clas1.a,classes.clas1.b)
        val x = classes.clas1.sumOfFields()


        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView).apply {
            text = x.toString()
        }
    }
}