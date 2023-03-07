package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    //Please, EVERYBODY, feel free to create Dashboard Page locators for elements!!!
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"appmenu\"]//span")
    public List<WebElement> allDashboardLinks;

    @FindBy (xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contact;

    public void clickOneOfTheDashboardOptions(String option){
        String linkOption = "//a[@aria-label='"  + option + "']";
        WebElement link = Driver.getDriver().findElement(By.xpath(linkOption));
        link.click();

    }
}
