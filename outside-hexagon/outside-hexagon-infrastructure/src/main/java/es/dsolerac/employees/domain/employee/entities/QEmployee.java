package es.dsolerac.employees.domain.employee.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployee extends EntityPathBase<Employee> {

    private static final long serialVersionUID = -743784343L;

    public static final QEmployee employee = new QEmployee("employee");

    public final DatePath<java.time.LocalDate> birthDate = createDate("birthDate", java.time.LocalDate.class);

    public final ListPath<EmployeeDepartment, QEmployeeDepartment> employeeDepartments = this.<EmployeeDepartment, QEmployeeDepartment>createList("employeeDepartments", EmployeeDepartment.class, QEmployeeDepartment.class, PathInits.DIRECT2);

    public final StringPath firstName = createString("firstName");

    public final EnumPath<Gender> gender = createEnum("gender", Gender.class);

    public final DatePath<java.time.LocalDate> hireDate = createDate("hireDate", java.time.LocalDate.class);

    public final NumberPath<Integer> idEmployee = createNumber("idEmployee", Integer.class);

    public final StringPath lastName = createString("lastName");

    public final ListPath<ManagerDepartment, QManagerDepartment> managerDepartments = this.<ManagerDepartment, QManagerDepartment>createList("managerDepartments", ManagerDepartment.class, QManagerDepartment.class, PathInits.DIRECT2);

    public final ListPath<Salary, QSalary> salaries = this.<Salary, QSalary>createList("salaries", Salary.class, QSalary.class, PathInits.DIRECT2);

    public final ListPath<Title, QTitle> titles = this.<Title, QTitle>createList("titles", Title.class, QTitle.class, PathInits.DIRECT2);

    public QEmployee(String variable) {
        super(Employee.class, forVariable(variable));
    }

    public QEmployee(Path<? extends Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployee(PathMetadata metadata) {
        super(Employee.class, metadata);
    }

}

