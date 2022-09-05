package group.domain;

import group.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "userLists", path = "userLists")
public interface UserListRepository
    extends PagingAndSortingRepository<UserList, Long> {}
