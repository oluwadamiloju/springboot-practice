package comspringboot.demo.springbootpractice.demo.dao;

import comspringboot.demo.springbootpractice.demo.models.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Query query =
                entityManager.createQuery("select m from Employee m", Employee.class);

        //execute query
        List<Employee> employees = query.getResultList();

        return employees;
    }

    @Override
    public void deleteEmployee(int employeeId) {
        //delete employee
        Query theQuery = entityManager.createQuery(
                "delete from Employee where employeeId=:employeeId"
        );

        theQuery.setParameter("employeeId", employeeId);

        theQuery.executeUpdate();
    }

    @Override
    public void save(Employee employee) {
        //save or update the employee
        Employee newEmployee = entityManager.merge(employee);

        //update with id from db
        employee.setEmployeeId(newEmployee.getEmployeeId());
    }

    @Override
    public Employee findById(int id) {
        //get employee
        Employee employee = entityManager.find(Employee.class, id);

        //return the employee
        return employee;
    }
}
