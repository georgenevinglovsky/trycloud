package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US06_RemoveFileFromFavorites_StepDef {
    FilesPage filesPage = new FilesPage();
    String nameOfFile;
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        //

        if (filesPage.favoriteOption.getText().equals("Remove from favorites")) {
            nameOfFile=filesPage.firstFileInList.getText();
            System.out.println(nameOfFile);
            BrowserUtils.sleep(2);
            BrowserUtils.clickActionOptions("Favorite");
        }
        if (filesPage.favoriteOption.getText().equals("Add to favorites")){
            nameOfFile=filesPage.firstFileInList.getText();
            System.out.println(nameOfFile);
            BrowserUtils.sleep(2);
            BrowserUtils.clickActionOptions("Favorite");
            Driver.getDriver().navigate().refresh();
            BrowserUtils.sleep(10);
            filesPage.actionOptnBtn.click();
            BrowserUtils.clickActionOptions("Favorite");


        }


    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
       filesPage.navigationOptionsLeftSide.get(2).click();
        BrowserUtils.sleep(2);
    }

    @Then("Verify that the file is not listed in the Favorites table")
    public void verify_that_the_file_is_not_listed_in_the_favorites_table() {
        WebElement noFavHeader = Driver.getDriver().findElement(By.xpath("//*[@id='emptycontent']/h2"));
        if (noFavHeader.isDisplayed()){
            Assert.assertTrue(true);
            System.out.println("Star shining bright");
        }else{
            BrowserUtils.confirmFileExist(nameOfFile);
        }

    }
}
