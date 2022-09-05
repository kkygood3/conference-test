package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MeetingRoomRegistered extends AbstractEvent {

    private Long id;
    private Long roomId;
    private String name;
    private String location;
    private Boolean used;
    private String remark;

    public MeetingRoomRegistered(MeetingRoom aggregate) {
        super(aggregate);
    }

    public MeetingRoomRegistered() {
        super();
    }
    // keep

}
