package com.example.homeworks.HW15.Task2

class FixedPayment(name: String, id: Int, position: String, payment: Double) :
    Worker(name, id, position, payment) {

    override fun calculatePayment() {
        this.payment = this.payment
    }

}