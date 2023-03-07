package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PhotosModulePage {
    public PhotosModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='app-navigation__list']//a/span")
    public List<WebElement> photosModuleList;

    public List<String> getPhotosModulesName(){
        List<String> list = new ArrayList<>();
        for (WebElement each : photosModuleList) {
            list.add(each.getText());
        }
        return list;
    }
}
