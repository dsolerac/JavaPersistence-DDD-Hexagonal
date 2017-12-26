package es.dsolerac.employees.domain.employee.repository;

import es.dsolerac.employees.domain.employee.entities.Department;

/**
 * Created by dsolerac on 22/12/17.
 */
public interface DepartmentRepository<T extends  Department, Integer> extends CrudRepository<T, Integer>{

    public T findDepartmentByName(String firstName);

}
