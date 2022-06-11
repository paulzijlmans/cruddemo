package nl.paulzijlmans.springboot.cruddemo.dao;

import lombok.AllArgsConstructor;
import nl.paulzijlmans.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Employee> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);

        return query.getResultList();
    }
}
