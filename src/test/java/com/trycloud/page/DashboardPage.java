package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    //Please, EVERYBODY, feel free to create Dashboard Page locators for elements!!!
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//ul[@id='appmenu']//li")
    public List<WebElement> allDashboardLinks;
}
