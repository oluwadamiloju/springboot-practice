package comspringboot.demo.springbootpractice.demo.dao;

import comspringboot.demo.springbootpractice.demo.models.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    void deleteEmployee(int id);
    void save(Employee employee);
    Employee findById(int id);
}
