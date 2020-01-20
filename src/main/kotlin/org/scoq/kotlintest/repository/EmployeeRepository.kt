package org.scoq.kotlintest.repository

import org.scoq.kotlintest.model.Employee
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class EmployeeRepository {

    fun getEmployeeById(id: Int): Mono<Employee> = Mono.just(Employee(1, "name"))
}
