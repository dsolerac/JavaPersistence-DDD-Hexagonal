package es.dsolerac.employees.domain.employee.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployeeDepartment is a Querydsl query type for EmployeeDepartment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployeeDepartment extends EntityPathBase<EmployeeDepartment> {

    private static final long serialVersionUID = 141045915L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmployeeDepartment employeeDepartment = new QEmployeeDepartment("employeeDepartment");

    public final es.dsolerac.employees.domain.employee.entities.composedIds.QEmployeeDepartmentID employeeDepartmentID;

    public final DatePath<java.time.LocalDate> fromDate = createDate("fromDate", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> toDate = createDate("toDate", java.time.LocalDate.class);

    public QEmployeeDepartment(String variable) {
        this(EmployeeDepartment.class, forVariable(variable), INITS);
    }

    public QEmployeeDepartment(Path<? extends EmployeeDepartment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmployeeDepartment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmployeeDepartment(PathMetadata metadata, PathInits inits) {
        this(EmployeeDepartment.class, metadata, inits);
    }

    public QEmployeeDepartment(Class<? extends EmployeeDepartment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employeeDepartmentID = inits.isInitialized("employeeDepartmentID") ? new es.dsolerac.employees.domain.employee.entities.composedIds.QEmployeeDepartmentID(forProperty("employeeDepartmentID"), inits.get("employeeDepartmentID")) : null;
    }

}

