package comspringboot.demo.springbootpractice.demo.dao;

import comspringboot.demo.springbootpractice.demo.models.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
