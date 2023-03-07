package com.trycloud.utilities;

import org.openqa.selenium.By;
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
    public static void clickOneOfTheDashboardOptions(String option){
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
        String locator = "//div[contains(@class,'fileActionsMenu')]//a[@data-action='"+option+ "']/span";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
