package es.dsolerac.employees.application.services;


import es.dsolerac.employees.domain.employee.entities.*;
import es.dsolerac.employees.domain.employee.entities.composedIds.TitleID;
import es.dsolerac.employees.domain.employee.repository.DepartmentRepository;
import es.dsolerac.employees.domain.employee.repository.EmployeeRepository;
import es.dsolerac.employees.infrastructure.persistence.springData.BaseRepositoryImpl;
import es.dsolerac.employees.infrastructure.persistence.springData.impl.DepartmentDataRepository;
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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * Created by dsolerac on 14/06/17.
// */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EmployeeConfig.class)
@Transactional
public class EmployeeServiceTest {

    private static final Logger LOG = LogManager.getLogger(EmployeeServiceTest.class);


    @Qualifier(BeanNames.infrastructure.repositories.departmentRepository)
    @Autowired
    DepartmentRepository departmentRepository;


    @Qualifier(BeanNames.infrastructure.repositories.employeeRepository)
    @Autowired
    EmployeeRepository employeeRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void countEmployees() {
        System.out.println("#### 1 -->" + employeeRepository.count());
    }

    @Test
    public void countByGender() {
        System.out.println("#### 6 -->" + employeeRepository.countEmployeesByGender(Gender.F));
    }

    @Test
    public void countByBirthDateAfter() {
        System.out.println("#### 5 -->" + employeeRepository.countByBirthDateAfter(LocalDate.parse("1965-01-31")));
    }


    @Test
    public void findByID() {
        System.out.println("#### 2 -->" + employeeRepository.findById(10006));
    }

    @Test
    public void findByfirstNameLike() {
        System.out.println("#### 3 -->" + employeeRepository.findByfirstNameLike("martins%"));

    }
    @Test
    public void findByBirthDateAfter() {
        System.out.println("#### 4 -->" + employeeRepository.findByBirthDateAfter(LocalDate.parse("1965-01-31")) );

    }

    @Test
    @Rollback( false )
    public void saveEmployee() {

        if (employeeRepository.existsById(500001)) {
            employeeRepository.deleteById(500001);
        }

        Employee e = new Employee();
        e.setIdEmployee(500001);
        e.setFirstName("Javier");
        e.setLastName("Solera");
        e.setGender(Gender.M);
        e.setHireDate(LocalDate.now());
        e.setBirthDate(LocalDate.now());

        List<Salary> ls = new ArrayList<>();
        Salary s = new Salary();
        s.setEmployee(e);
        s.setFromDate(LocalDate.now().minusYears(2));
        s.setToDate(LocalDate.now());
        s.setSalary(55555);
        ls.add(s);
        s = new Salary();
        s.setEmployee(e);
        s.setFromDate(LocalDate.now());
        s.setToDate(LocalDate.parse("9999-12-12"));
        s.setSalary(99999);
        ls.add(s);

        List<Title> lt = new ArrayList<>();
        Title t = new Title();
        TitleID tid= new TitleID();
        tid.setTitle("Casi jefazo");
        tid.setFromDate(LocalDate.now().minusYears(2));
        t.setTitleID(tid);
        t.setEmployee(e);
        t.setToDate(LocalDate.now());
        lt.add(t);
        t = new Title();
        tid= new TitleID();
        tid.setTitle("Super jefazo");
        tid.setFromDate(LocalDate.now());
        t.setTitleID(tid);
        t.setEmployee(e);
        t.setToDate(LocalDate.parse("9999-12-12"));
        lt.add(t);

            List <EmployeeDepartment> led = new ArrayList<>();
            EmployeeDepartment ed = new EmployeeDepartment();
            ed.setEmployee(e);
            ed.setDeparment(departmentRepository.findDepartmentByName("Finance"));
            ed.setFromDate(LocalDate.now().minusYears(2));
            ed.setToDate(LocalDate.now());
                led.add(ed);
            ed = new EmployeeDepartment();
            ed.setEmployee(e);
            ed.setDeparment(departmentRepository.findDepartmentByName("Sales"));
            ed.setFromDate(LocalDate.now());
            ed.setToDate(LocalDate.parse("9999-12-12"));
               led.add(ed);

        List <ManagerDepartment> lmd = new ArrayList<>();
        ManagerDepartment md = new ManagerDepartment();
        md.setEmployee(e);
        md.setDeparment(departmentRepository.findDepartmentByName("Sales"));
        md.setFromDate(LocalDate.now());
        md.setToDate(LocalDate.parse("9999-12-12"));
        lmd.add(md);


        e.setSalaries(ls);
        e.setTitles(lt);
        e.setEmployeeDepartments(led);
        e.setManagerDepartments(lmd);

        employeeRepository.save(e);


/*        Employee e2 = (Employee) employeeRepository.findById(500001).get();
        System.out.println("#### 10 -->" + e2.getSalaries() );*/



    }

    @Test
    public void getEmployeeDepartments() {
        Optional<Employee> employeeOptional = employeeRepository.findById(10488);
        Employee employee = employeeOptional.get();
        System.out.println("#### 7 -->" + employee.getEmployeeDepartments());
    }

    @Test
    public void getManagerDepartments() {

        Optional<Employee> employeeOptional = employeeRepository.findById(110183);
        Employee employee = employeeOptional.get();
        System.out.println("#### 8 -->" + employee.getManagerDepartments() );
    }



}