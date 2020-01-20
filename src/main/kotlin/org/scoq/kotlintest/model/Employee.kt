package org.scoq.kotlintest.model

class Employee(val id: Int, name: String) {

    val name: String = name
        get() {println("pouet"); return field}

    operator fun plus(e: Employee) = this.name + "-" + e.name
}
