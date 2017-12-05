//import com.querydsl.jpa.codegen.JPADomainExporter;

import com.querydsl.jpa.codegen.JPADomainExporter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import java.io.File;
import java.io.IOException;

/**
 *
 * Esta clase es un exportador de código para QueryDSL de la configuración de JPA sin anotaciones, es decir desde el
 * archivo persistence.xml y los archivos de configuración orm en XML.
 *
 *
 * Para que funcione es necesario que haya conexión a la BD, lo más fácil y cómodo es añadir los datos de conexión al
 * archivo persistence.xml:
 *
 *             <property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/employees"/>
 *             <property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver" />
 *             <property name="hibernate.connection.username" value="root"/>
 *             <property name="hibernate.connection.password" value="****"/>
 *             <property name="hibernate.connection.pool_size" value="5"/>
 *
 *
 * Created by dsolerac on 4/12/17.
 */
public class JPA_XMLConfiguration_QueryDSL_Exporter {


    protected static EntityManagerFactory emf;

    protected EntityManager em;

    public static void main(String[] args) throws IOException {


        JPA_XMLConfiguration_QueryDSL_Exporter b = new JPA_XMLConfiguration_QueryDSL_Exporter();
        b.exportar();
    }

    private void exportar() throws IOException {


        emf = Persistence.createEntityManagerFactory("Employees");


        em = emf.createEntityManager();
        em.getTransaction().begin();


        Metamodel metamodel = em.getMetamodel();

        for (EntityType t: metamodel.getEntities()) {
            System.out.println("METAMODEL -->" + t.getName() );

        }

//        JPADomainExporter exporter = new JPADomainExporter(new File("/home/dsolerac/Proyectos/Employees/outside-hexagon/outside-hexagon-infrastructure/src/generated-sources/java"), metamodel);
        JPADomainExporter exporter = new JPADomainExporter( new File("/home/dsolerac/Proyectos/Employees/outside-hexagon/outside-hexagon-infrastructure/src/main/java"), metamodel);
        exporter.setUnknownAsEntity(true);
        exporter.execute();


        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }

        if (em.isOpen()) {
            em.close();
        }


        emf.close();

    }

//    private void exportJPADomainWithAnt(){
//
//        AntJPADomainExporter.Configuration config = new AntJPADomainExporter.Configuration();
////        config.
//
//        AntJPADomainExporter aa = new AntJPADomainExporter();
//        aa.setTargetFolder("src/generated-sources/java");
//        aa.setPersistenceUnitName("Employees");
//        aa.addConfiguration(config);
//        aa.execute();
//
//
//
//    }


}
