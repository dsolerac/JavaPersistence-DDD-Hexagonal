package es.dsolerac.employees.infrastructure.persistence.springData.impl;


import com.querydsl.jpa.impl.JPAQueryFactory;
import es.dsolerac.employees.domain.employee.entities.Employee;
import es.dsolerac.employees.domain.employee.entities.Gender;
import es.dsolerac.employees.domain.employee.entities.QEmployee;
import es.dsolerac.employees.domain.employee.repository.EmployeeRepository;
import es.dsolerac.employees.infrastructure.persistence.springData.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import java.time.LocalDate;
import java.util.List;

/**
 * Esta es la implementación del repositorio definido en el dominio
 *
 * Created by dsolerac on 1/12/17.
 */
@Repository
@Transactional
public class EmployeeRepositoryImpl  implements EmployeeRepository<Employee, Integer> {


    @Autowired
    private EmployeeDataRepository repository;

    @PersistenceUnit
    EntityManagerFactory emf;

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Employee> findByfirstNameLike(String firstName) {
        return repository.findByfirstNameLike(firstName);
    }

    @Override
    public List<Employee> findByBirthDateAfter(LocalDate localDate) {
        return repository.findByBirthDateAfter(localDate);
    }

    @Override
    public List<Employee> countByBirthDateAfter(LocalDate localDate) {
        return repository.countByBirthDateAfter(localDate);
    }

    @Override
    public long countByGender() {

        System.out.println("###### ini ######## JQL");
        Query emQuery = em.createQuery("SELECT COUNT (e) FROM employees e WHERE e.gender = :gender");
        emQuery.setParameter("gender", Gender.M );
        Object count = emQuery.getSingleResult();
        System.out.println("###### fin ######## JQL");

//-------------------------------------------

        System.out.println("###### ini ######## CRITERIA");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        Metamodel m = em.getMetamodel();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        EntityType<Employee> empl_ = m.entity(Employee.class);

        Root<Employee> employeeRoot = cq.from(empl_);

        cq.where(
                cb.equal(
                        employeeRoot.get(empl_.getSingularAttribute("lastName")), "Maliniak" )
                );
        TypedQuery<Employee> q = em.createQuery(cq);
        List<Employee> allPets = q.getResultList();
        count=(long)allPets.size();
        System.out.println("###### fin ######## CRITERIA");

//-------------------------------------------


        System.out.println("###### ini ######## QUERYDSL");
        QEmployee qEmployee = QEmployee.employee;
        JPAQueryFactory query = new JPAQueryFactory(em);
        count = query.selectFrom(qEmployee).where(qEmployee.gender.eq(Gender.M)).fetchCount();

        System.out.println("###### fin ######## QUERYDSL");


        return (long)count;

    }


}
