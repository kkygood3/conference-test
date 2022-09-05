package group.infra;

import group.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserListHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserList>> {

    @Override
    public EntityModel<UserList> process(EntityModel<UserList> model) {
        return model;
    }
}
