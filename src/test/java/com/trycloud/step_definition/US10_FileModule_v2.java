package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
public class US10_FileModule_v2 {
        FilesPage filePage = new FilesPage();
        @Given(": user logged in successfully and on the home page")
        public void user_logged_in_successfully_and_on_the_home_page() {
            BrowserUtils.login();
            Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigurationReader.getProperty("homepageTitle")));
        }

        @When("the user clicks on the {string} module")
        public void theUserClicksOnTheModule(String moduleName) {
            BrowserUtils.clickOneOfTheHeaderOptions(moduleName);
        }
        @When("user click action-icon from any file on the page")
        public void user_click_action_icon_from_any_file_on_the_page() {
            BrowserUtils.sleep(4);
            filePage.actionIconAllFile.get(0).click();
        }
        @When("user choose the {string} folder option")
        public void user_choose_the_folder_option(String option) {
            BrowserUtils.sleep(4);
            BrowserUtils.clickActionOptions(option);
        }
        @When("the user clicks the Deleted folder sub-module on the left side")
        public void the_user_clicks_the_deleted_folder_sub_module_on_the_left_side() {
            filePage.navigationOptionsLeftSide.get(7).click();
        }
        @Then("Verify the deleted file is displayed on the Deleted Files page.")
        public void verify_the_deleted_file_is_displayed_on_the_deleted_files_page() {
            for (WebElement each : filePage.deletedFilesAndFolders) {
                if (each.getText().equals(filePage.getFileOrFolderName())){
                    Assert.assertTrue(true);
                }
            }
        }
}
