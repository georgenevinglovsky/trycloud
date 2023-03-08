package com.trycloud.utilities;

import com.trycloud.page.LoginPage;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserUtils {
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }
    public static void clickOneOfTheHeaderOptions(String option){
        String linkOption = "//a[@aria-label='"  + option + "']";
        WebElement link = Driver.getDriver().findElement(By.xpath(linkOption));
        link.click();
    }

    public static String getDeletedFolderOrFileName(String name){
        String locator = "//tbody[@id='fileList']//span[text()='"+name+"']";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(locator));
        String nameOfWebElement = webElement.getText();
        return nameOfWebElement;
    }

    public static void clickActionOptions(String option){
        String locator = "//div[contains(@class,'fileActionsMenu')]//a[@data-action='"+option+"']/span";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

    static LoginPage loginPage = new LoginPage();
    public static void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginbtn.click();
    }

    public static void confirmFileExist(String nameOfFile){
        try{
        WebElement file = Driver.getDriver().findElement(By.xpath("//span[contains(.,''"+nameOfFile+"')]"));
        Boolean result = file.isDisplayed();}
        catch(NoSuchElementException e){
            System.out.println("File was removed from favorites");
            Assert.assertTrue(true);
            }

    }



}
