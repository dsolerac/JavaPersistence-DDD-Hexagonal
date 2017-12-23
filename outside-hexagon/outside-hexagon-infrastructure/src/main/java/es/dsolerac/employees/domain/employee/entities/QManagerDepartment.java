package es.dsolerac.employees.domain.employee.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QManagerDepartment is a Querydsl query type for ManagerDepartment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QManagerDepartment extends EntityPathBase<ManagerDepartment> {

    private static final long serialVersionUID = 1188111236L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QManagerDepartment managerDepartment = new QManagerDepartment("managerDepartment");

    public final DatePath<java.time.LocalDate> fromDate = createDate("fromDate", java.time.LocalDate.class);

    public final es.dsolerac.employees.domain.employee.entities.composedIds.QManagerDepartmentID managerDepartmentID;

    public final DatePath<java.time.LocalDate> toDate = createDate("toDate", java.time.LocalDate.class);

    public QManagerDepartment(String variable) {
        this(ManagerDepartment.class, forVariable(variable), INITS);
    }

    public QManagerDepartment(Path<? extends ManagerDepartment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QManagerDepartment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QManagerDepartment(PathMetadata metadata, PathInits inits) {
        this(ManagerDepartment.class, metadata, inits);
    }

    public QManagerDepartment(Class<? extends ManagerDepartment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.managerDepartmentID = inits.isInitialized("managerDepartmentID") ? new es.dsolerac.employees.domain.employee.entities.composedIds.QManagerDepartmentID(forProperty("managerDepartmentID"), inits.get("managerDepartmentID")) : null;
    }

}

