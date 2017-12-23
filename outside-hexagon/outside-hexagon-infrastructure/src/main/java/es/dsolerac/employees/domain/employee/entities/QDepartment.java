package es.dsolerac.employees.domain.employee.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDepartment is a Querydsl query type for Department
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDepartment extends EntityPathBase<Department> {

    private static final long serialVersionUID = -1132029363L;

    public static final QDepartment department = new QDepartment("department");

    public final ListPath<EmployeeDepartment, QEmployeeDepartment> employeeDepartments = this.<EmployeeDepartment, QEmployeeDepartment>createList("employeeDepartments", EmployeeDepartment.class, QEmployeeDepartment.class, PathInits.DIRECT2);

    public final StringPath idDepartment = createString("idDepartment");

    public final ListPath<ManagerDepartment, QManagerDepartment> managerDepartments = this.<ManagerDepartment, QManagerDepartment>createList("managerDepartments", ManagerDepartment.class, QManagerDepartment.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QDepartment(String variable) {
        super(Department.class, forVariable(variable));
    }

    public QDepartment(Path<? extends Department> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDepartment(PathMetadata metadata) {
        super(Department.class, metadata);
    }

}

