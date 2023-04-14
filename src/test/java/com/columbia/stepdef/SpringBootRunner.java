package com.columbia.stepdef;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest
public class SpringBootRunner {

    @Autowired
    public WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void setup() {
//        driver.navigate().to(appUrl);
    }

    @After
    public void tearDownCucumberSpringContext(Scenario scenario) {
        driver.close();
    }
}
