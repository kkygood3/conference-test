package group.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import group.config.kafka.KafkaProcessor;
import group.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ConferenceReserved'"
    )
    public void wheneverConferenceReserved_MeetingInformationAlarm(
        @Payload ConferenceReserved conferenceReserved
    ) {
        ConferenceReserved event = conferenceReserved;
        System.out.println(
            "\n\n##### listener MeetingInformationAlarm : " +
            conferenceReserved +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ConferenceReservationCanceled'"
    )
    public void wheneverConferenceReservationCanceled_MeetingInformationAlarm(
        @Payload ConferenceReservationCanceled conferenceReservationCanceled
    ) {
        ConferenceReservationCanceled event = conferenceReservationCanceled;
        System.out.println(
            "\n\n##### listener MeetingInformationAlarm : " +
            conferenceReservationCanceled +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ConferenceInformationChanged'"
    )
    public void wheneverConferenceInformationChanged_MeetingInformationAlarm(
        @Payload ConferenceInformationChanged conferenceInformationChanged
    ) {
        ConferenceInformationChanged event = conferenceInformationChanged;
        System.out.println(
            "\n\n##### listener MeetingInformationAlarm : " +
            conferenceInformationChanged +
            "\n\n"
        );
        // Sample Logic //

    }
    // keep

}
