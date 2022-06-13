package nl.paulzijlmans.springboot.cruddemo.dao;

import nl.paulzijlmans.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
