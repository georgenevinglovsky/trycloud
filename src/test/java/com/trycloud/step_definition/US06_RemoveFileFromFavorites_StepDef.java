package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US06_RemoveFileFromFavorites_StepDef {
    FilesPage filesPage = new FilesPage();

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        String locator = "//div[contains(@class,'fileActionsMenu')]//a[@data-action='" + string + "']/span";
        WebElement actionOption = Driver.getDriver().findElement(By.xpath(locator));
        if (actionOption.isDisplayed()) {
            BrowserUtils.sleep(2);
            BrowserUtils.clickActionOptions(string);
        }else {
            BrowserUtils.sleep(2);
            filesPage.emptyplace.click();
        }


    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
      //  filesPage.navigationOptionsLeftSide.get(2).click();
    }

    @Then("Verify that the file is not listed in the Favorites table")
    public void verify_that_the_file_is_not_listed_in_the_favorites_table() {

    }
}
