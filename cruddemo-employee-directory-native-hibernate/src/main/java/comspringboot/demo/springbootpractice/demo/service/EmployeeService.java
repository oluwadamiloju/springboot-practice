package comspringboot.demo.springbootpractice.demo.service;

import comspringboot.demo.springbootpractice.demo.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void deleteEmployee(int id);
    void save(Employee employee);
    Employee findById(int id);
}
