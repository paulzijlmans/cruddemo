package nl.paulzijlmans.springboot.cruddemo.service;

import nl.paulzijlmans.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
