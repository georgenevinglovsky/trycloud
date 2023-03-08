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

    @FindBy(xpath = "//a[@class ='button new']")
    public WebElement addIcon ;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadButton;

    @FindBy(xpath = "//span[.='Locations']")
    public WebElement newUploadedFile;



}
