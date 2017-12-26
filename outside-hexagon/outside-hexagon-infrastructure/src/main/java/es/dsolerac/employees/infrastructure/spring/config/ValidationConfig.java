package es.dsolerac.employees.infrastructure.spring.config;

import es.dsolerac.employees.infrastructure.spring.BeanNames;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * Created by dsolerac on 24/12/17.
 */
@Configuration
public class ValidationConfig {

    @Bean(BeanNames.infrastructure.entityValidator)
    Validator validator(){

//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        return validator;

        //De este modo Spring busca la existencia de un validador de beans en el classpath (encotrará hibernate validator factory)
        return  new LocalValidatorFactoryBean();
    }

}
