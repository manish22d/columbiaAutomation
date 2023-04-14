package com.columbia.tests;

import com.columbia.po.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    Login loginPage;


    @BeforeSuite(alwaysRun = true)
    protected void setupWebDriver() throws Exception {
        super.springTestContextPrepareTestInstance();
        loginPage.launchApplication().login();
        logger.info("****** Before Suite Setup ******");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownSuite() {
        loginPage.closeApplication();
        logger.info("****** Tear Down Setup ******");
        logger.info("****** Suite Tear Down ******");
    }


}
