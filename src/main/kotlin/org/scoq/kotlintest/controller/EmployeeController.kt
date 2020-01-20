package org.scoq.kotlintest.controller

import org.scoq.kotlintest.repository.EmployeeRepository
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController (
        private val employeeRepository: EmployeeRepository
) {

    @GetMapping("/")
    fun blog(model: Model) = employeeRepository.getEmployeeById(1).subscribe { println(it.name) }
    
}
