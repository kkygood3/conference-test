package group.external;

import org.springframework.stereotype.Service;

@Service
public class UserListServiceImpl implements UserListService {

    /**
     * Fallback
     */
    public UserList getUserList(Long id) {
        UserList userList = new UserList();
        return userList;
    }
    // keep

}
