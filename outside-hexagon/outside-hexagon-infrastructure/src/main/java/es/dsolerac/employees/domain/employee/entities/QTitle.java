package es.dsolerac.employees.domain.employee.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTitle is a Querydsl query type for Title
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTitle extends EntityPathBase<Title> {

    private static final long serialVersionUID = -54912387L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTitle title = new QTitle("title");

    public final QEmployee employee;

    public final es.dsolerac.employees.domain.employee.entities.composedIds.QTitleID titleID;

    public final DatePath<java.time.LocalDate> toDate = createDate("toDate", java.time.LocalDate.class);

    public QTitle(String variable) {
        this(Title.class, forVariable(variable), INITS);
    }

    public QTitle(Path<? extends Title> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTitle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTitle(PathMetadata metadata, PathInits inits) {
        this(Title.class, metadata, inits);
    }

    public QTitle(Class<? extends Title> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
        this.titleID = inits.isInitialized("titleID") ? new es.dsolerac.employees.domain.employee.entities.composedIds.QTitleID(forProperty("titleID")) : null;
    }

}

