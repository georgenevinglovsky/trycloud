package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WriteCommentsPage_FS {
    public WriteCommentsPage_FS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//tbody[@id='fileList']//td[2])//span[@class='fileactions']")
    public WebElement dotDotDotIcon;

    @FindBy (id="commentsTabView")
    public WebElement commentsButton;

    @FindBy (xpath = "//div[@id='rightClickMenu']//li")
    public List<WebElement> detailsButton;

    @FindBy (xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement postButton;

    @FindBy (xpath = "//*[@id='appmenu']//a")
    public List<WebElement> appMenu;

    @FindBy (xpath = "//nav[@class='app-sidebar-tabs__nav']//a")
    public List<WebElement> sideBarTab;

    @FindBy (xpath = "//div[@class='message']")
    public  WebElement postedComments;

}
