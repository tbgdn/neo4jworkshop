package ro.ucv.ace.neo4jworkshop.model.time;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import ro.ucv.ace.neo4jworkshop.model.GraphEntity;

import java.util.Set;

@Getter
@Setter
@NodeEntity
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Day extends GraphEntity {

    @Index
    Long value;

    @Relationship(type = "HAS_HOUR")
    Set<Hour> hours;

    @Relationship(type = "NEXT_DAY")
    Day nextDay;
}
