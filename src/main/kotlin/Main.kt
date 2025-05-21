package com.project.clean

fun main() {
    val controller = Controller()
    // should just throw it
    val user = controller.getCurrentUser("5")
    println(user)
}