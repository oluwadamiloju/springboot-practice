package comspringboot.demo.springbootpractice.demo.restcontroller;

import comspringboot.demo.springbootpractice.demo.models.Employee;
import comspringboot.demo.springbootpractice.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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
    public Employee addEmployee(@RequestBody Employee employee) {
        //force set id to 0 if an id is passed in, just so it does not update but creates a new employee
        employee.setEmployeeId(0);
        employeeService.save(employee);
        return employee;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);

        if(employee == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        //check if employee exists
        Employee employee = employeeService.findById(id);
        if(employee == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }
        employeeService.deleteEmployee(id);
        return "Deleted Employee id -" + id;
    }
}
