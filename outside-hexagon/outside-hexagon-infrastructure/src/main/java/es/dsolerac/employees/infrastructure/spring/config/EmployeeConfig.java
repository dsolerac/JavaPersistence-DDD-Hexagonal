package es.dsolerac.employees.infrastructure.spring.config;

import es.dsolerac.employees.domain.employee.repository.EmployeeRepository;
import es.dsolerac.employees.infrastructure.persistence.springData.impl.EmployeeDataRepository;
import es.dsolerac.employees.infrastructure.persistence.springData.impl.EmployeeRepositoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by dsolerac on 14/06/17.
 */
@Configuration
//@ComponentScan({"es.dsolerac.employees.infrastructure.persistence.springData"})
@Import({PersistenceConfig.class})
public class EmployeeConfig {

    private static final Logger LOG = LogManager.getLogger(EmployeeConfig.class);


    public class UserRegistry {

        private final Logger LOG = LogManager.getLogger(UserRegistry.class);

        @Qualifier("employeeDataRepository")
        @Autowired
        private EmployeeDataRepository employeeDataRepository;


        //Domain layer


        //Application layer
//        @Bean(name = BeanNames.application.employeeService)
//        public EmployeeService employeeService() {
//
////            UserRegistryService service = new UserRegistryServiceImpl(userDomainService(), shortNameDomainService(), userRepository);
//            EmployeeService service = new EmployeeServiceImpl(employeeRepository);
//
//            return service;
//        }

//        @Bean (name="employee")
//        public Employee employee(){
//            Employee employee = new Employee();
//            return employee;
//        }

        @Bean(name = "EmployeeRepository")
        public EmployeeRepository employeeRepository(){

            EmployeeRepository em = new EmployeeRepositoryImpl(employeeDataRepository);

            return em;
        }


    }


}
