package es.dsolerac.employees.domain.employee.repository;

import es.dsolerac.employees.domain.employee.entities.Gender;

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
public interface EmployeeRepository<T, ID> extends CrudRepository<T, ID> {


    public List<T> findByfirstNameLike(String firstName);

    public List<T> findByBirthDateAfter(LocalDate localDate);

    public List<T> countByBirthDateAfter(LocalDate localDate);

    public long countEmployeesByGender(Gender gender);




}
