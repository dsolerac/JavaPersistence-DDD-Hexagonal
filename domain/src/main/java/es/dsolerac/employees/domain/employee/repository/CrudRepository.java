package es.dsolerac.employees.domain.employee.repository;

import java.util.Optional;


/**
 * Esta interfaz tiene el objetivo de no acoplar el código a ninguna implementación de un framework concreto, como
 * puede ser Spring Data JPA, JOOQ, MyBatis, etc.
 *
 * Los métodos están copiados de Sping Data JPA, ya que son adecuados, y servirán como base para ser implementados por
 * cualquier otro framework de persistencia.
 *
 * Cada uno de estos frameworks tienen una gran variedad de funcionalidades, si se viese la necesidad de utilizar alguna
 * de ellas para facilitar el desarrollo, ese método deberá ser incluido aquí. De esta forma podrá ser implmentado
 * posteriormente conforme requiera dicho framework.
 *
 * Ejemplos:
 * · Spring Data JPA provee del siguiente método, que como se puede ver está acoplado al framework:
 *      List<T> findAll(org.springframework.data.domain.Sort sort)
 *   En este caso se podría definir aquí este método del siguiente modo:
 *      List<T> findAllSorted()
 *   Así de este modo cuando se realice la implementación del método se podrá utilizar el provisto por el framework,
 *   del siguiente modo:
 *          public List<T> findAllSorted() {
 *              //Instancia y configuración de la clase Sort...
 *                return findAll(sort);
 *          }
 *
 *
 * Created by dsolerac on 10/11/17.
 */
public interface CrudRepository<T, ID>  {

    <S extends T> S save(S var1);

    <S extends T> Iterable<S> saveAll(Iterable<S> var1);

    Optional<T> findById(ID var1);

    boolean existsById(ID var1);

    Iterable<T> findAll();

    Iterable<T> findAllById(Iterable<ID> var1);

    long count();

    void deleteById(ID var1);

    void delete(T var1);

    void deleteAll(Iterable<? extends T> var1);

    void deleteAll();

}
