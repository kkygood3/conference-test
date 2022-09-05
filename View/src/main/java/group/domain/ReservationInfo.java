package group.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="ReservationInfo_table")
@Data
public class ReservationInfo {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long hostId;
        private Long roomId;
        private List&lt;Long&gt; userIds;
        private String reserveName;
        private String roomName;
        private Boolean roomUsed;


}