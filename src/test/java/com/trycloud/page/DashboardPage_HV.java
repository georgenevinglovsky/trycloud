package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_HV {
   public DashboardPage_HV(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
    @FindBy(xpath = "//span[.='Magnify icon']")
    public WebElement magnifier;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchField;
    @FindBy(xpath = "//strong")
    public WebElement searchResult;





}
