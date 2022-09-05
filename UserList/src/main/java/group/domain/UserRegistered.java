package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserRegistered extends AbstractEvent {

    private Long id;

    public UserRegistered(UserList aggregate) {
        super(aggregate);
    }

    public UserRegistered() {
        super();
    }
    // keep

}
