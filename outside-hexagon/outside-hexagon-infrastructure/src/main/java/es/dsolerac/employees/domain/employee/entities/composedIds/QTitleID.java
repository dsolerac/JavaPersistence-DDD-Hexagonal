package es.dsolerac.employees.domain.employee.entities.composedIds;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTitleID is a Querydsl query type for TitleID
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QTitleID extends BeanPath<TitleID> {

    private static final long serialVersionUID = -1562153168L;

    public static final QTitleID titleID = new QTitleID("titleID");

    public final DatePath<java.time.LocalDate> fromDate = createDate("fromDate", java.time.LocalDate.class);

    public final StringPath title = createString("title");

    public QTitleID(String variable) {
        super(TitleID.class, forVariable(variable));
    }

    public QTitleID(Path<? extends TitleID> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTitleID(PathMetadata metadata) {
        super(TitleID.class, metadata);
    }

}

