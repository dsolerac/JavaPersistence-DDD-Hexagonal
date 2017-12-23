package es.dsolerac.employees.domain.employee.repository;

import es.dsolerac.employees.domain.employee.entities.Department;

import java.util.List;

/**
 * Created by dsolerac on 22/12/17.
 */
public interface DepartmentRepository<T extends  Department, Integer> {

    public T findDepartmentByName(String firstName);

}
