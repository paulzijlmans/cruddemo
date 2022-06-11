package nl.paulzijlmans.springboot.cruddemo.rest;

import lombok.AllArgsConstructor;
import nl.paulzijlmans.springboot.cruddemo.dao.EmployeeDAO;
import nl.paulzijlmans.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
