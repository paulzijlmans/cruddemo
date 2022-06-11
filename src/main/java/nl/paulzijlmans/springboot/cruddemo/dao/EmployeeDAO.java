package nl.paulzijlmans.springboot.cruddemo.dao;

import nl.paulzijlmans.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
