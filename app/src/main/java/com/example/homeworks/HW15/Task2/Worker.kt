package com.example.homeworks.HW15.Task2

abstract class Worker(
    val name: String,
    val id: Int,
    val position: String,
    var payment : Double
) {


    override fun toString(): String {
        return "Worker(name='$name', secondName='$id', position='$position')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Worker

        if (name != other.name) return false
        if (id != other.id) return false
        if (position != other.position) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id.hashCode()
        result = 31 * result + position.hashCode()
        return result
    }

    abstract fun calculatePayment()

}