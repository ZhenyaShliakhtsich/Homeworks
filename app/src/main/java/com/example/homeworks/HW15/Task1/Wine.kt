package com.example.homeworks.HW15.Task1

import java.util.*

 class Wine(
    var name: String,
    val trademark: String,
    val dateOfBottling: GregorianCalendar,
    val note: String
) {

    override fun toString(): String {
        return "Название : $name\n Марка : $trademark\n Дата розлива : $dateOfBottling\n Примечание : $note"
    }

    fun calculateWineAging(): String {
        var year = GregorianCalendar()
        return (year.get(Calendar.YEAR)
                - dateOfBottling.get(Calendar.YEAR)).toString()
    }
}