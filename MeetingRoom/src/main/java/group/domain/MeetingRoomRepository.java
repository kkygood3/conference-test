package group.domain;

import group.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "meetingRooms",
    path = "meetingRooms"
)
public interface MeetingRoomRepository
    extends PagingAndSortingRepository<MeetingRoom, Long> {}
