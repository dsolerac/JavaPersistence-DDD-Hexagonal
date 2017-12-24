package es.dsolerac.employees.infrastructure.spring.config;

import es.dsolerac.employees.infrastructure.persistence.springData.BaseRepositoryImpl;
import es.dsolerac.employees.infrastructure.spring.BeanNames;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by dsolerac on 15/06/17.
 */
@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:jdbc.properties" })
@EnableJpaRepositories( basePackages = "es.dsolerac.employees.infrastructure.persistence.springData.impl")
public class PersistenceConfig {

    private static final Logger LOG = LogManager.getLogger(PersistenceConfig.class);



    @Autowired
    private Environment env;

    @Bean(name = BeanNames.infrastructure.dataSource)
    public DataSource dataSource() {

//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.HSQL)
////                .addScript("classpath:schema.sql")
////                .addScript("classpath:test-data.sql")
//                .build();


        BasicDataSource dataSource = new BasicDataSource();
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName( env.getProperty("hibernate.connection.driver_class"));
        dataSource.setUrl( env.getProperty("hibernate.connection.url"));
        dataSource.setUsername( env.getProperty("hibernate.connection.username"));
        dataSource.setPassword( env.getProperty("hibernate.connection.password"));


        dataSource.setInitialSize( Integer.valueOf(env.getProperty("hibernate.connection.initialSize")) );
        dataSource.setDefaultAutoCommit( Boolean.parseBoolean(env.getProperty("hibernate.connection.defaultAutoCommit")) );

        return dataSource;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
        lef.setDataSource(dataSource());
        lef.setJpaVendorAdapter(jpaVendorAdapter());
//        lef.afterPropertiesSet();


        return lef;
    }


    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(true);
        hibernateJpaVendorAdapter.setGenerateDdl(false);
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);


        return hibernateJpaVendorAdapter;
    }

    @Bean
    public JpaDialect jpaDialect(){

        HibernateJpaDialect jpaDialect = new HibernateJpaDialect();
        return jpaDialect;

    }

    @Bean(name = BeanNames.infrastructure.transactionManager)
    public JpaTransactionManager jpaTransactionManager (){

        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        jpaTransactionManager.setDataSource(dataSource());
        jpaTransactionManager.setJpaDialect(jpaDialect());

        return jpaTransactionManager;

    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }


}
