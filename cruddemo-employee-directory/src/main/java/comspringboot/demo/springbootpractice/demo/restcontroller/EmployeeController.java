package comspringboot.demo.springbootpractice.demo.restcontroller;

import comspringboot.demo.springbootpractice.demo.dao.EmployeeDAO;
import comspringboot.demo.springbootpractice.demo.models.Employee;
import comspringboot.demo.springbootpractice.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService employeeService;

    //inject employee dao
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //expose endpoints
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    public void save() {
        Employee employee = new Employee();
        employeeService.save(employee);
    }
}
