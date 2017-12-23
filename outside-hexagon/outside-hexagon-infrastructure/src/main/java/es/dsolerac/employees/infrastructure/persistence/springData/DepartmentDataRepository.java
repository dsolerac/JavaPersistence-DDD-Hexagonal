package es.dsolerac.employees.infrastructure.persistence.springData;

import es.dsolerac.employees.domain.employee.entities.Department;
import es.dsolerac.employees.domain.employee.repository.DepartmentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dsolerac on 22/12/17.
 */

@Transactional
public interface DepartmentDataRepository<Department extends es.dsolerac.employees.domain.employee.entities.Department, Integer> extends JpaRepository<Department, Integer>, DepartmentRepository<Department, Integer> {



}
