package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "reservationInfos",
    path = "reservationInfos"
)
public interface ReservationInfoRepository
    extends PagingAndSortingRepository<ReservationInfo, Long> {
    List<ReservationInfo> findByRoomId(Long roomId);

    void deleteByRoomId(Long roomId);
    // keep

}
