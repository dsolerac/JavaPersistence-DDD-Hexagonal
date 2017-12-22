package es.dsolerac.employees.application.services;


import es.dsolerac.employees.domain.employee.entities.Employee;
import es.dsolerac.employees.infrastructure.persistence.springData.EmployeeDataRepository;
import es.dsolerac.employees.infrastructure.spring.config.EmployeeConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


/**
 * Created by dsolerac on 14/06/17.
// */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EmployeeConfig.class)
@Transactional
public class EmployeeServiceTest {


//    @Qualifier("employeeDataRepository")
//    @Autowired
//    EmployeeRepository employeeRepository;

//    @Autowired
//    EmployeeRepositoryImpl employeeRepository;

    @Autowired
    EmployeeDataRepository employeeRepository;

//    @Qualifier("employeeRepositoryImpl")
//    @Autowired
//    EmployeeDataRepository employeeRepository;

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }
    

    @Test
    public void count(){

//        EmployeeDataRepository edr = (EmployeeDataRepository) employeeRepository;
//        edr.findById(10006);

//        System.out.println("#### -->" + entityManagerFactory.createEntityManager().find(Employee.class,10006) );
//        System.out.println("#### -->" + entityManagerFactory.createEntityManager().find(Employee.class,10006) );


//        System.out.println("#### 1 -->" + employeeRepository.count());
//        System.out.println("#### 2 -->" + employeeRepository.find(10006));
//        System.out.println("#### 3 -->" + employeeRepository.findByfirstNameLike("martins%"));
//        System.out.println("#### 4 -->" + employeeRepository.findByBirthDateAfter(LocalDate.parse("1965-01-31")) );
//        System.out.println("#### 5 -->" + employeeRepository.countByBirthDateAfter(LocalDate.parse("1965-01-31")));
//        System.out.println("#### 6 -->" + employeeRepository.countByGender(Gender.F));


        Optional<Employee> employeeOptional = employeeRepository.findById(10488);
        Employee employee = employeeOptional.get();
        System.out.println("#### 7 -->" + employee.getEmployeeDepartments());


        employeeOptional = employeeRepository.findById(110183);
        employee = employeeOptional.get();
        System.out.println("#### 8 -->" + employee.getManagerDepartments() );



        //Este método se usaba cuando la relación era de muchos a muchos sin campos en la tabla intermedia
//        System.out.println("#### 7 -->" + employee.getDeparmentsManagers() );




    }

    @Test
    @Ignore
    public void thisShortNameAlreadyExists() throws Exception {

//        assertTrue( service.alreadyExistsThisShortName("dsolerac")) ;
//        assertTrue( service.alreadyExistsThisShortName("ccarrascom")) ;
//
//        assertFalse( service.alreadyExistsThisShortName("jantonio") );

    }


    @Test
    @Ignore
    public void modifyUser() throws Exception {

//        user.setName("pepe");
//        service.modifyUser(user);
//        user = service.getUser( user.getShortName().keyToString());
//        assertEquals( "pepe", user.getName() );
//        assertNotEquals( "dsolerac", user.getName() );

    }

    @Test
    @Ignore
    public void deleteUser() throws Exception {

//        service.deleteUser( service.getUser("dsolerac") );
//
//        assertNull( service.getUser("dsolerac") );
//        assertNotNull( service.getUser("ccarrascom") );

    }

}