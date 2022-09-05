package group.infra;

import group.config.kafka.KafkaProcessor;
import group.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ReservationInfoViewHandler {

    @Autowired
    private ReservationInfoRepository reservationInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenConferenceReserved_then_CREATE_1(
        @Payload ConferenceReserved conferenceReserved
    ) {
        try {
            if (!conferenceReserved.validate()) return;

            // view 객체 생성
            ReservationInfo reservationInfo = new ReservationInfo();
            // view 객체에 이벤트의 Value 를 set 함
            reservationInfo.setRoomId(conferenceReserved.getRoomId());
            reservationInfo.setHostId(
                Long.valueOf(conferenceReserved.getName())
            );
            reservationInfo.setId(conferenceReserved.getId());
            reservationInfo.setUserIds(
                Long.valueOf(conferenceReserved.getUserIds())
            );
            reservationInfo.setRoomUsed(true);
            reservationInfo.setReserveName(conferenceReserved.getName());
            // view 레파지 토리에 save
            reservationInfoRepository.save(reservationInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenConferenceInformationChanged_then_UPDATE_1(
        @Payload ConferenceInformationChanged conferenceInformationChanged
    ) {
        try {
            if (!conferenceInformationChanged.validate()) return;
            // view 객체 조회

            List<ReservationInfo> reservationInfoList = reservationInfoRepository.findByRoomId(
                conferenceInformationChanged.getRoomId()
            );
            for (ReservationInfo reservationInfo : reservationInfoList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                reservationInfo.setRoomId(
                    conferenceInformationChanged.getRoomId()
                );
                reservationInfo.setHostId(
                    conferenceInformationChanged.getHostId()
                );
                reservationInfo.setId(conferenceInformationChanged.getId());
                reservationInfo.setUserIds(
                    Long.valueOf(conferenceInformationChanged.getUserIds())
                );
                reservationInfo.setReserveName(
                    conferenceInformationChanged.getName()
                );
                // view 레파지 토리에 save
                reservationInfoRepository.save(reservationInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenConferenceReservationCanceled_then_DELETE_1(
        @Payload ConferenceReservationCanceled conferenceReservationCanceled
    ) {
        try {
            if (!conferenceReservationCanceled.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            reservationInfoRepository.deleteByRoomId(
                conferenceReservationCanceled.getRoomId()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // keep

}
