package es.dsolerac.employees.domain.employee.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSalary is a Querydsl query type for Salary
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSalary extends EntityPathBase<Salary> {

    private static final long serialVersionUID = -1738549691L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSalary salary1 = new QSalary("salary1");

    public final QEmployee employee;

    public final DatePath<java.time.LocalDate> fromDate = createDate("fromDate", java.time.LocalDate.class);

    public final NumberPath<Integer> salary = createNumber("salary", Integer.class);

    public final DatePath<java.time.LocalDate> toDate = createDate("toDate", java.time.LocalDate.class);

    public QSalary(String variable) {
        this(Salary.class, forVariable(variable), INITS);
    }

    public QSalary(Path<? extends Salary> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSalary(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSalary(PathMetadata metadata, PathInits inits) {
        this(Salary.class, metadata, inits);
    }

    public QSalary(Class<? extends Salary> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
    }

}

