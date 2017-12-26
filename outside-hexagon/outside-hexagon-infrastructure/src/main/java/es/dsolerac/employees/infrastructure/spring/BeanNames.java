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
        final String transactionManager = "transactionManager";
        final String entityValidator = "validator";

        public interface repositories {

            final String employeeRepository = "employeeRepository";
            final String departmentRepository = "departmentRepository";

            public interface springDataJpaRepositories{

                final String employeeDataRepository = "employeeDataRepository";
                final String departmentDataRepository = "departmentDataRepository";

            }

        }

        public interface controllers {



        }



        public interface spring {


        }


    }



}
