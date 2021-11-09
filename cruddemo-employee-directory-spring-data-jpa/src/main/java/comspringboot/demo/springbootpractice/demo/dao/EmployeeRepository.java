package comspringboot.demo.springbootpractice.demo.dao;

import comspringboot.demo.springbootpractice.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
