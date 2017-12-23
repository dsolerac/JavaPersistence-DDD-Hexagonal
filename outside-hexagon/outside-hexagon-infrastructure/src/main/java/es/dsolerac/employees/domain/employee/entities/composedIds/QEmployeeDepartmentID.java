package es.dsolerac.employees.domain.employee.entities.composedIds;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployeeDepartmentID is a Querydsl query type for EmployeeDepartmentID
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QEmployeeDepartmentID extends BeanPath<EmployeeDepartmentID> {

    private static final long serialVersionUID = 769287966L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmployeeDepartmentID employeeDepartmentID = new QEmployeeDepartmentID("employeeDepartmentID");

    public final es.dsolerac.employees.domain.employee.entities.QDepartment department;

    public final es.dsolerac.employees.domain.employee.entities.QEmployee employee;

    public QEmployeeDepartmentID(String variable) {
        this(EmployeeDepartmentID.class, forVariable(variable), INITS);
    }

    public QEmployeeDepartmentID(Path<? extends EmployeeDepartmentID> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmployeeDepartmentID(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmployeeDepartmentID(PathMetadata metadata, PathInits inits) {
        this(EmployeeDepartmentID.class, metadata, inits);
    }

    public QEmployeeDepartmentID(Class<? extends EmployeeDepartmentID> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new es.dsolerac.employees.domain.employee.entities.QDepartment(forProperty("department")) : null;
        this.employee = inits.isInitialized("employee") ? new es.dsolerac.employees.domain.employee.entities.QEmployee(forProperty("employee")) : null;
    }

}

