package es.dsolerac.employees.infrastructure.persistence.springData;

import es.dsolerac.employees.domain.employee.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

/**
 *
 * Mediante esta clase base, se implementan todos los métodos defnidos en la interfaz CrudRepository de forma que
 * sean comunes a todos los repositorios que extiendan de ella.
 *
 * Created by dsolerac on 23/12/17.
 */
@NoRepositoryBean
public class BaseRepositoryImpl<T, ID> implements CrudRepository<T, ID>  {

    private JpaRepository repository;

    public BaseRepositoryImpl(JpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public <S extends T> S save(S var1) {
        return (S) repository.save(var1);
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> var1) {
        return repository.saveAll(var1);
    }

    @Override
    public Optional<T> findById(ID var1) {
        return repository.findById(var1);
    }

    @Override
    public boolean existsById(ID var1) {
        return repository.existsById(var1);
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> var1) {
        return repository.findAllById(var1);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(ID var1) {
        repository.deleteById(var1);
    }

    @Override
    public void delete(T var1) {
        repository.delete(var1);
    }

    @Override
    public void deleteAll(Iterable<? extends T> var1) {
        repository.deleteAll(var1);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
