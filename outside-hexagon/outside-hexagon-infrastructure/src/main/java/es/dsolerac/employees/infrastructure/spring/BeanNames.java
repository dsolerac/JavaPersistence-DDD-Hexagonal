package es.dsolerac.employees.infrastructure.spring;

/**
 * Created by dsolerac on 14/06/17.
 */
public interface BeanNames {


    public interface domain {

        public interface employee {

            //Incluir los DomainServices

        }

    }

    public interface application {

        final String employeeService = "employeeService";

    }

    public interface infrastructure {

        final String dataSource = "dataSource";

        public interface repositories {

            //********
            //SE INJECTAN POR MEDIO DE @ComponentScan({ "es.dsolerac.pfg.infrastructure.persistence.hibernate.persistence" })
//            final String userRepository = "userRepository";

//            final String inMemoryUserRepository = "inMemoryUserRepository";
//            final String hibernateUserRepository = "hibernateUserRepository";
            final String employeeDataRepository = "employeeDataRepository";


        }

        public interface controllers {



        }



        public interface spring {


        }


        public interface hiberante {

            final String sessionFactory = "sessionFactory";
            final String transactionManager = "transactionManager";

        }

    }



}
