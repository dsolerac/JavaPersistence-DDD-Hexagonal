package es.dsolerac.employees.application.services;


import es.dsolerac.employees.domain.employee.repository.EmployeeRepository;
import es.dsolerac.employees.infrastructure.persistence.springData.EmployeeDataRepository;
import es.dsolerac.employees.infrastructure.spring.config.EmployeeConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;


/**
 * Created by dsolerac on 14/06/17.
// */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EmployeeConfig.class)
@Transactional
public class EmployeeServiceTest {


//    @Autowired
//    EmployeeService service;


//    private User user2;

    @Qualifier("employeeRepositoryImpl")
    @Autowired
    EmployeeRepository employeeRepository;

    @Before
    public void setUp() throws Exception {


//        user = new User(new ShortName("dsolerac"));
//        user.setName("daniel");
//        user.setEmail( new EmailAddress("dsolerac@gmail.com"));
//
//        user2 = new User(new ShortName("ccarrascom"));
//        user2.setName("carolina");
//        user2.setEmail( new EmailAddress("ccarrascom@gmail.com"));
//
//        service.createUser(user2);
//        service.createUser(user);

    }

    @After
    public void tearDown() throws Exception {

    }




    @Test
    public void count(){

//        System.out.println("#### -->" + entityManagerFactory.createEntityManager().find(Employee.class,10006) );
//        System.out.println("#### -->" + entityManagerFactory.createEntityManager().find(Employee.class,10006) );


//        System.out.println("#### 1 -->" + employeeRepository.count());
//        System.out.println("#### 2 -->" + employeeRepository.findOne(10006));
//        System.out.println("#### 3 -->" + employeeRepository.findByfirstNameLike("martins%"));
//        System.out.println("#### 4 -->" + employeeRepository.findByBirthDateAfter(LocalDate.parse("1965-01-31")) );
//        System.out.println("#### 5 -->" + employeeRepository.countByBirthDateAfter(LocalDate.parse("1965-01-31")));

        System.out.println("#### 6 -->" + employeeRepository.countByGender());

//        service.count();


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