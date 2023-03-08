package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteCommentsPage_FS {
    public WriteCommentsPage_FS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='action action-menu permanent']//span[@class='icon icon-more']")
    public WebElement dotDotDotIcon;

    @FindBy (id="commentsTabView")
    public WebElement commentsButton;

    @FindBy (xpath = "//div[@id='rightClickMenu']//li[2]")
    public WebElement detailsButton;
}
