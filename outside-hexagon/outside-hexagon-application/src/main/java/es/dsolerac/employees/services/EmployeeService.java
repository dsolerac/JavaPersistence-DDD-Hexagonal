package es.dsolerac.employees.services;

import es.dsolerac.employees.domain.employee.entities.Employee;

import java.util.Optional;

/**
 * Created by dsolerac on 10/11/17.
 */
public interface EmployeeService {

    Employee save(Employee var1);

    Iterable<Employee> saveAll(Iterable<Employee> var1);

    Optional<Employee> findById(Integer var1);

    boolean existsById(Integer var1);

    Iterable<Employee> findAll();

    Iterable<Employee> findAllById(Iterable<Integer> var1);

    long count();

    void deleteById(Integer var1);

    void delete(Employee var1);

    void deleteAll(Iterable<Employee> var1);

    void deleteAll();


}
