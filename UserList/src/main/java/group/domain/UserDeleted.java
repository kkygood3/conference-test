package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserDeleted extends AbstractEvent {

    private Long id;

    public UserDeleted(UserList aggregate) {
        super(aggregate);
    }

    public UserDeleted() {
        super();
    }
    // keep

}
