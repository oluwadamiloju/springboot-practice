package comspringboot.demo.springbootpractice.demo.dao;

import comspringboot.demo.springbootpractice.demo.models.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //create query
        String query = "select m from Employee m";
        //execute query
        List<Employee> employees = currentSession.createQuery(query,
                Employee.class).getResultList();

        return employees;
    }
}
