package group.domain;

import group.MeetingRoomApplication;
import group.domain.MeetingRoomDeleted;
import group.domain.MeetingRoomRegistered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MeetingRoom_table")
@Data
public class MeetingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomId;

    private String name;

    private String location;

    private Boolean used;

    private String remark;

    @PostPersist
    public void onPostPersist() {
        MeetingRoomRegistered meetingRoomRegistered = new MeetingRoomRegistered(
            this
        );
        meetingRoomRegistered.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        MeetingRoomDeleted meetingRoomDeleted = new MeetingRoomDeleted(this);
        meetingRoomDeleted.publishAfterCommit();
    }

    public static MeetingRoomRepository repository() {
        MeetingRoomRepository meetingRoomRepository = MeetingRoomApplication.applicationContext.getBean(
            MeetingRoomRepository.class
        );
        return meetingRoomRepository;
    }

    public static void conferenceRoomUse(
        ConferenceReserved conferenceReserved
    ) {
        /** Example 1:  new item 
        MeetingRoom meetingRoom = new MeetingRoom();
        repository().save(meetingRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(conferenceReserved.get???()).ifPresent(meetingRoom->{
            
            meetingRoom // do something
            repository().save(meetingRoom);


         });
        */

    }

    public static void cancellationOfMeetingRoomUse(
        ConferenceReservationCanceled conferenceReservationCanceled
    ) {
        /** Example 1:  new item 
        MeetingRoom meetingRoom = new MeetingRoom();
        repository().save(meetingRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(conferenceReservationCanceled.get???()).ifPresent(meetingRoom->{
            
            meetingRoom // do something
            repository().save(meetingRoom);


         });
        */

    }

    public static void changeOfMeetingRoomUsageInformation(
        ConferenceInformationChanged conferenceInformationChanged
    ) {
        /** Example 1:  new item 
        MeetingRoom meetingRoom = new MeetingRoom();
        repository().save(meetingRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(conferenceInformationChanged.get???()).ifPresent(meetingRoom->{
            
            meetingRoom // do something
            repository().save(meetingRoom);


         });
        */

    }
}
