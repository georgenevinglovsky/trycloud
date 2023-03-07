package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteCommentsPage_FS {
    public WriteCommentsPage_FS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "fileList")
    public WebElement fileList;
}
