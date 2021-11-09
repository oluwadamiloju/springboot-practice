package comspringboot.demo.springbootpractice.demo.service;

import comspringboot.demo.springbootpractice.demo.models.Employee;
import comspringboot.demo.springbootpractice.demo.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent()) {
            employee = result.get();
        } else {
            throw new RuntimeException("Employee id - " + id + " not found");
        }
        return employee;
    }
}
