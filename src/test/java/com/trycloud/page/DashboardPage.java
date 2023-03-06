package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    //Please, EVERYBODY, feel free to create Dashboard Page locators for elements!!!
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
