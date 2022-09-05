package group.domain;

import group.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "conferences",
    path = "conferences"
)
public interface ConferenceRepository
    extends PagingAndSortingRepository<Conference, Long> {}
