package group.domain;

import group.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class ConferenceReservationCanceled extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private String name;
    private Integer roomId;
    private Integer hostId;
    private List&lt;Integer&gt; userIds;
}
