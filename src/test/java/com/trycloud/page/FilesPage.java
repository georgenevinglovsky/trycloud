package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FilesPage {
    ////Please, EVERYBODY, feel free to create Dashboard Page locators for elements!!!
    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileAndFolderList;

    public String getFileOrFolderName(){
        List<String> names = new ArrayList<>();
        for (WebElement each : fileAndFolderList) {
            names.add(each.getText());
        }
        return names.get(0);
    }
    @FindBy(xpath = "//a[@class='action action-menu permanent']/span[@class]")
    public List<WebElement> actionIconAllFile;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li/a")
    public List<WebElement> navigationOptionsLeftSide;

    @FindBy(xpath = "//span[.='LorensoWorld']")
    public List<WebElement> deletedFilesAndFolders;

}