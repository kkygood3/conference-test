package group.common;

import group.MeetingRoomApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MeetingRoomApplication.class })
public class CucumberSpingConfiguration {}
