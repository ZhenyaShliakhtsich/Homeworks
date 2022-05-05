package com.example.homeworks.HW14


class Fibonachi {
    var list = arrayListOf(0,1)
    fun sum(a: Int, b: Int) = a + b
    fun fibonachi(): String {
        for (iteration in 0..10) {
            val c: Int = sum(list.last(),list.get(list.lastIndex-1) )
            list.add(c)
        }
        return list.toString()
    }



}