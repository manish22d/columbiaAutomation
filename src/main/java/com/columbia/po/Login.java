package com.columbia.po;

import com.columbia.po.salesHub.SalesDashboard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@Component
public class Login extends BasePage {

    @Autowired
    SalesDashboard salesDashboard;
    @FindBy(name = "loginfmt")
    WebElement emailTextbox;

    @FindBy(name = "passwd")
    WebElement passwordTextbox;

    @FindBy(id = "idSIButton9")
    WebElement nxtbtn;

    @FindBy(xpath = "//a[@title='Insights Sales Hub']")
    WebElement salesHub;

    @Value("${userId}")
    private String email;
    @Value("${pwd}")
    private String pwd;

    public Login login() {
        wait.until(visibilityOf(emailTextbox));
        emailTextbox.sendKeys(email);
        nxtbtn.click();
        wait.until(visibilityOf(passwordTextbox));
        passwordTextbox.sendKeys(pwd);
        nxtbtn.click();
        return this;
    }
    public SalesDashboard launchSalesHub(){
        wait.until(visibilityOf(salesHub));
        salesHub.click();
        return salesDashboard;
    }

}
