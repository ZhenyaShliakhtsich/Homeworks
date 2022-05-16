package com.example.homeworks.HW16

import java.util.*
import kotlin.collections.ArrayList

object DateCreater : Observer {
    override fun update(p0: Observable?, p1: Any?) {
    }

    fun addTime(list: ArrayList<Note>) {
        list[list.size-1].date = Date()

    }
}