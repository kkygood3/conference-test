package group.common;

import group.UserListApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserListApplication.class })
public class CucumberSpingConfiguration {}
