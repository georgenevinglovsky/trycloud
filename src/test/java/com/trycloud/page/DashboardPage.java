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
    @FindBy(xpath = "//ul[@id='appmenu']/li/a")
    public List<WebElement> modules;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Files']")
    public WebElement Files;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Dashboard']")
    public WebElement dashboard;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Photos']")
    public WebElement Photos;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Activity']")
    public WebElement Activity;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Talk']")
    public WebElement Talk;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Contacts']")
    public WebElement Contacts;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Circles']")
    public WebElement Circles;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Calendar']")
    public WebElement Calendar;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Deck']")
    public WebElement Deck;
}
