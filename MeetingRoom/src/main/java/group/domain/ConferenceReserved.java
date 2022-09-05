package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ConferenceReserved extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private String name;
    private Integer roomId;
    private Integer hostId;
    private Object userIds;
    // keep

}
