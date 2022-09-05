package group.domain;

import group.ReservationAppApplication;
import group.domain.ConferenceInformationChanged;
import group.domain.ConferenceReservationCanceled;
import group.domain.ConferenceReserved;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Conference_table")
@Data
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reserveId;

    private String name;

    private Integer roomId;

    private Integer hostId;

    @ElementCollection
    @ElementCollection
    private List<Integer> userIds;

    @PostPersist
    public void onPostPersist() {
        ConferenceReserved conferenceReserved = new ConferenceReserved(this);
        conferenceReserved.publishAfterCommit();
        // Get request from UserList
        //group.external.UserList userList =
        //    Application.applicationContext.getBean(group.external.UserListService.class)
        //    .getUserList(/** mapping value needed */);

    }

    @PreUpdate
    public void onPreUpdate() {
        ConferenceInformationChanged conferenceInformationChanged = new ConferenceInformationChanged(
            this
        );
        conferenceInformationChanged.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        ConferenceReservationCanceled conferenceReservationCanceled = new ConferenceReservationCanceled(
            this
        );
        conferenceReservationCanceled.publishAfterCommit();
    }

    public static ConferenceRepository repository() {
        ConferenceRepository conferenceRepository = ReservationAppApplication.applicationContext.getBean(
            ConferenceRepository.class
        );
        return conferenceRepository;
    }
}
