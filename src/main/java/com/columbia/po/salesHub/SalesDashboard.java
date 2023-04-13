package com.columbia.po.salesHub;

import com.columbia.po.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesDashboard extends BasePage {
    @FindBy(xpath = "//a[@title='Insights Sales Hub']")
    WebElement opportunity;

    @FindBy(xpath = "//a[@title='Insights Sales Hub']")
    WebElement salesHub;
    public void createOppertunity(){

    }
}
