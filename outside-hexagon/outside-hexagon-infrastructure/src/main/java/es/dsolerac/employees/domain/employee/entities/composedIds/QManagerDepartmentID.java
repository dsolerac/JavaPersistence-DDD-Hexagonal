package es.dsolerac.employees.domain.employee.entities.composedIds;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QManagerDepartmentID is a Querydsl query type for ManagerDepartmentID
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QManagerDepartmentID extends BeanPath<ManagerDepartmentID> {

    private static final long serialVersionUID = -1431777673L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QManagerDepartmentID managerDepartmentID = new QManagerDepartmentID("managerDepartmentID");

    public final es.dsolerac.employees.domain.employee.entities.QDepartment department;

    public final es.dsolerac.employees.domain.employee.entities.QEmployee employee;

    public QManagerDepartmentID(String variable) {
        this(ManagerDepartmentID.class, forVariable(variable), INITS);
    }

    public QManagerDepartmentID(Path<? extends ManagerDepartmentID> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QManagerDepartmentID(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QManagerDepartmentID(PathMetadata metadata, PathInits inits) {
        this(ManagerDepartmentID.class, metadata, inits);
    }

    public QManagerDepartmentID(Class<? extends ManagerDepartmentID> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new es.dsolerac.employees.domain.employee.entities.QDepartment(forProperty("department")) : null;
        this.employee = inits.isInitialized("employee") ? new es.dsolerac.employees.domain.employee.entities.QEmployee(forProperty("employee")) : null;
    }

}

