package es.dsolerac.employees.infrastructure.persistence.springData.impl;

import es.dsolerac.employees.domain.employee.entities.Department;
import es.dsolerac.employees.domain.employee.repository.DepartmentRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dsolerac on 22/12/17.
 */

@Transactional
public interface DepartmentDataRepository<T, ID> extends JpaRepository<Department, Integer>, DepartmentRepository<Department, Integer> {

    Logger LOG = LogManager.getLogger(DepartmentDataRepository.class);

}
