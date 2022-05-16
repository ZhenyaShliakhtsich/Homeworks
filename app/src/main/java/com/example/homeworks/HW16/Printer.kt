package com.example.homeworks.HW16

import java.util.*
import kotlin.collections.ArrayList

object Printer : Observer {
    override fun update(p0: Observable?, p1: Any?) {
    }

    fun printAll(p1: ArrayList<Note>) {
        p1.forEach { println(it.toString()) }
        println("-----------------------------")
    }
}