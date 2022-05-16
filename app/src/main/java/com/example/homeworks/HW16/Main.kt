package com.example.homeworks.HW16

import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule

fun main() {
    var singleton = Sigleton
    val printer = Printer
    val dateCreator = DateCreater
    singleton.listOfNotes = ArrayList()
    while (true) {
        TimeUnit.SECONDS.sleep(30)
            singleton.listOfNotes.add(Note())
            dateCreator.addTime(singleton.listOfNotes)
            printer.printAll(singleton.listOfNotes)
        }
    }

