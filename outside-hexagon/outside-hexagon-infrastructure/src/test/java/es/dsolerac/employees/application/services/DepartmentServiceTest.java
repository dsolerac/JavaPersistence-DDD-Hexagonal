package es.dsolerac.employees.application.services;


import es.dsolerac.employees.domain.employee.entities.Department;
import es.dsolerac.employees.domain.employee.repository.DepartmentRepository;
import es.dsolerac.employees.domain.employee.repository.EmployeeRepository;
import es.dsolerac.employees.infrastructure.spring.BeanNames;
import es.dsolerac.employees.infrastructure.spring.config.EmployeeConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


/**
 * Created by dsolerac on 14/06/17.
// */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EmployeeConfig.class)
@Transactional
public class DepartmentServiceTest {

    private static final Logger LOG = LogManager.getLogger(DepartmentServiceTest.class);


    @Qualifier(BeanNames.infrastructure.repositories.departmentRepository)
    @Autowired
    private DepartmentRepository departmentRepository;


    @Qualifier(BeanNames.infrastructure.repositories.employeeRepository)
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Validator validator;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Rollback(false)
    public void createNewDepartment(){

        Department dept = new Department();
        dept.setName("Bean Validation");
        dept.setIdDepartment("d010");


        Set<ConstraintViolation<Department>> violations = validator.validate(dept);

        for (ConstraintViolation<Department> violation : violations) {
            System.out.println("ERROR al crear el bean " + violation.getRootBeanClass().getName()+", en la propiedad " + violation.getPropertyPath() + "-->" + violation.getMessage() );
        }

//        JPA no permite hacer una inserción si hay alguna violación de una constrain definida en el bean (bean validation).
        departmentRepository.save(dept);

    }


}