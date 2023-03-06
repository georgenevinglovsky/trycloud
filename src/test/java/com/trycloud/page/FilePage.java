package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilePage {
    public FilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement fileLink;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIconAllFile;

}
