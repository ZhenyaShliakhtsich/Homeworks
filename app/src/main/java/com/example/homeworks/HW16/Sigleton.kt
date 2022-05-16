package com.example.homeworks.HW16

import java.util.*
import java.util.concurrent.Flow
import kotlin.collections.ArrayList
import java.util.concurrent.Flow.Publisher

object Sigleton : Observable() {
    var listOfNotes = ArrayList<Note>()
}