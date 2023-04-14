package com.columbia.po.dashboard;

import com.columbia.po.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@Component
public class Intake extends BasePage {
    @FindBy(xpath = "//label[contains(.,'Claim No.')]/..//input")
    WebElement claimInputBox;
    @FindBy(xpath = "//label[contains(.,'Source')]/parent::div//input")
    WebElement source;
    @FindBy(xpath = "//label[contains(.,'Queue')]/..//input")
    WebElement queueInputBox;


    public Intake searchClaim(String claimId) {
        wait.until(visibilityOf(claimInputBox));
        claimInputBox.sendKeys(claimId + Keys.ENTER);
        return this;
    }

    public void updateClaim(Map<String, String> claimDetails) {

    }
}
