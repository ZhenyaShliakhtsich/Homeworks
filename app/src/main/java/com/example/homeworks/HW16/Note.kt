package com.example.homeworks.HW16

import java.util.*

class Note(var header: String = "",
           var message: String = "",
           var date: Date? = null) {

    init {
        val random = (0..5).random()
        when (random){
            0 -> {this.header = "0"
                this.message="Message0"}
            1 -> {this.header = "1"
                this.message="Message1"}
            2 -> {this.header = "2"
                this.message="Message2"}
            3 -> {this.header = "3"
                this.message="Message3"}
            4 -> {this.header = "4"
                this.message="Message4"}
            5 -> {this.header = "5"
                this.message="Message5"}
        }
    }

    override fun toString(): String {
        return "Note(header='$header', message='$message', date=$date)"
    }

}