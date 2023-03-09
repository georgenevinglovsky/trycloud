package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
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

    @FindBy (xpath = "//tr[@data-mime='httpd/unix-directory']//a")
    public List<WebElement>foldersList;

    public String getFolderName(){
       List<String> names2 = new ArrayList<>();
        for (WebElement each : foldersList) {
            names2.add((each.getText()));
        }
        return names2.get(0);
    }

    @FindBy(xpath = "//span[contains(@class, 'extra-data')]")
    public List <WebElement> fileUploaded;
    public void verifyFileUploaded(String fileName) {
        List<String> filesList = new ArrayList<>();
        for (WebElement each : fileUploaded) {
            filesList.add(each.getAttribute("title"));
        }
        Assert.assertTrue(filesList.contains(fileName));
    }

    @FindBy(xpath = "//a[@class='action action-menu permanent']/span[@class]")
    public List<WebElement> actionIconAllFile;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li/a")
    public List<WebElement> navigationOptionsLeftSide;

    @FindBy(xpath = "//span[.='LorensoWorld']")
    public List<WebElement> deletedFilesAndFolders;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//a[@class='menuitem']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement typeInput;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span")
    public WebElement folderName;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[@class='displayname']")
    public WebElement uploadFile;

    @FindBy(xpath = "//div[@id='recommendations']")
    public WebElement emptyplace;

    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement firstFileInList;

    @FindBy(xpath = "(//div//span[@class='icon icon-starred'])[1]")
    public WebElement starIcon;

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/div/ul/li[3]/a")
    public WebElement favoriteOption;

    @FindBy(xpath = "(//a[@data-action='menu'])[1]")
    public WebElement actionOptnBtn;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadButton;

    @FindBy(xpath = "//span[.='Locations']")
    public WebElement newUploadedFile;

    @FindBy(xpath = "//button[@class='settings-button']")
    public  WebElement settingButton;


    @FindBy(xpath = "//input[@id='showRichWorkspacesToggle']")
    public  WebElement showRichWorkspacesToggle;

    @FindBy(xpath = "//input[@id='recommendationsEnabledToggle']")
    public  WebElement recommendationsEnabledToggle;

    @FindBy(xpath = "//input[@id='showhiddenfilesToggle']")
    public  WebElement showhiddenfilesToggle;

    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public  WebElement showRichWorkspacesToggleLabel;

    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public  WebElement recommendationsEnabledTogglLabel;

    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public  WebElement showhiddenfilesToggleLabel;

    @FindBy(xpath = "//p[@class='is-empty is-editor-empty']")
    public  WebElement notesParagraph;


    @FindBy(xpath = "//div[@id='recommendations']")
    public  WebElement recommendations;


}
