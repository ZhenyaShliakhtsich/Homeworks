package com.example.homeworks.HW15.Task2

class HourlyPayment(
    name: String,
    id: Int,
    position: String,
    val wage: Double,
    payment: Double
) :
    Worker(name, id, position, payment) {
    constructor(
        name: String,
        id: Int,
        position: String,
        wage: Double
    ) : this(name, id, position, wage, 0.0)

    init {
        this.payment = 20.8 * 8 * this.wage
    }

    override fun calculatePayment() {
        this.payment = 20.8 * 8 * this.wage
    }
}