package comspringboot.demo.springbootpractice.demo.restcontroller;

import comspringboot.demo.springbootpractice.demo.dao.EmployeeDAO;
import comspringboot.demo.springbootpractice.demo.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeDAO employeeDAO;

    //inject employee dao
    public EmployeeController(EmployeeDAO anEmployeeDAO) {
        employeeDAO = anEmployeeDAO;
    }

    //expose endpoints
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
