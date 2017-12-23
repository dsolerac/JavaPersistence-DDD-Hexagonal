package es.dsolerac.employees.infrastructure.persistence.springData.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import es.dsolerac.employees.domain.employee.entities.Employee;
import es.dsolerac.employees.domain.employee.entities.Gender;
import es.dsolerac.employees.domain.employee.entities.QEmployee;
import es.dsolerac.employees.domain.employee.repository.CrudRepository;
import es.dsolerac.employees.domain.employee.repository.EmployeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * ¡¡¡¡¡¡REDACTAR ESTO BIEN!!!!!!
 *
 *         //El nombre del método, al no ser reconocible por Spring data Jpa, éste  no puede proveer una implementación por defecto
 //para él de forma automática, por tanto se precisa de una implementación para él. Por suerte con Java 8 se puede
 //hacer uso de los métodos por defecto en las interfaces y así evitar crear una clase EmployeeDataRepositoryImpl
 //que obligaría a reimplemenar todos los métodos provenientes de JpaRepository y EmployeeRepository.
 //
 //En realidad este método nunca debería ser ejecutado, ya que durante el flujo normal ejecución de la aplicación
 //se tiene que injectar el bean de implementación del repositorio del dominio EmployeeRepositoryImpl que:
 // · Hará llamadas a esta interfaz de forma manual para los métodos que sabemos el framework proveerá una
 //   implementación de forma automática (ya que implementa JpaRepository), y asi se aprovechará ña potencia del
 //   framework, este tipo de métodos serán:
 //      · Los métodos cuyos nombres sean reconocibles por el framework y por tanto éste implemente
 //        automáticamente su query.
 //      · Los métodos a los que se les provea de una @query.
 // · Implementará los métodos para los cuales el framework de Spring Data JPA no proporciona una implementación,
 //   como es el caso concreto de este.
 *
 * Created by dsolerac on 30/11/17.
 */
@Transactional
public interface EmployeeDataRepository<T, ID> extends JpaRepository<Employee, Integer>, EmployeeRepository<Employee, Integer> {


    @Query("SELECT COUNT (e) FROM employees e WHERE e.birthDate > :localDate")
    public List<Employee> countByBirthDateAfter(@Param("localDate") LocalDate localDate);



}
