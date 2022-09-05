package group.infra;

import group.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ConferenceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Conference>> {

    @Override
    public EntityModel<Conference> process(EntityModel<Conference> model) {
        return model;
    }
}
