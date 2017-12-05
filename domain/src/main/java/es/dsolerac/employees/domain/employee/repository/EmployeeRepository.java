package es.dsolerac.employees.domain.employee.repository;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * En esta interface se deben identificar los métodos de negocio escritos en estilo Spring Data JPA. De este modo
 * Si el framework de persistencia usado en la infraestructura es Spring Data JPA serán provistas sus implementados
 * directamente y si no fuese este framework el nombre sería muy descriptivo y serán implementados como deban.
 *
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
 *
 * Created by dsolerac on 10/11/17.
 */
public interface EmployeeRepository<Employee, Integer> {


    public List<Employee> findByfirstNameLike(String firstName);

    public List<Employee> findByBirthDateAfter(LocalDate localDate);

    public List<Employee> countByBirthDateAfter(LocalDate localDate);

    public long countByGender();



}
