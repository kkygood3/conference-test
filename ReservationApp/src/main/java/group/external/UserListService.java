package group.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "UserList",
    url = "${api.url.UserList}",
    fallback = UserListServiceImpl.class
)
public interface UserListService {
    @RequestMapping(method = RequestMethod.GET, path = "/userLists/{userId}")
    public UserList getUserList(@PathVariable("userId") Long userId);
    // keep

}
