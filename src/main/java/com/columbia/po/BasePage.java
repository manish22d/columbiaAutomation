package com.columbia.po;


import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class BasePage {


    @Autowired
    public WebDriver driver;
    @Autowired
    public WebDriverWait wait;

    @Value("${app.url}")
    private String appUrl;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public Login launchApplication() {
        driver.navigate().to(appUrl);
        return (Login) this;
    }

    public BasePage closeApplication() {
        driver.close();
        return this;
    }


}
