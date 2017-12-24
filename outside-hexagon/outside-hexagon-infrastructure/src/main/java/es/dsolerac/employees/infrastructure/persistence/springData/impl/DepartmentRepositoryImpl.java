package es.dsolerac.employees.infrastructure.persistence.springData.impl;

import es.dsolerac.employees.domain.employee.entities.Department;
import es.dsolerac.employees.domain.employee.repository.DepartmentRepository;
import es.dsolerac.employees.infrastructure.persistence.springData.BaseRepositoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Created by dsolerac on 24/12/17.
 */
public class DepartmentRepositoryImpl<T, ID> extends BaseRepositoryImpl<Department, Integer> implements DepartmentRepository<Department, Integer>{

    private static final Logger LOG = LogManager.getLogger(DepartmentRepositoryImpl.class);


    private DepartmentDataRepository repository;

    @PersistenceUnit
    EntityManagerFactory emf;

    @PersistenceContext
    private EntityManager em;


    public DepartmentRepositoryImpl(DepartmentDataRepository repository) {
        super((JpaRepository)repository);
        this.repository=repository;
    }

    @Override
    public Department findDepartmentByName(String firstName) {
        return repository.findDepartmentByName(firstName);
    }


}
