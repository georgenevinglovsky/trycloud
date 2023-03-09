package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_CreateFolders {
    FilesPage filesPage = new FilesPage();

    @Given(": user logged in successfully and on the home page meiyin")
    public void user_logged_in_successfully_and_on_the_home_page_meiyin() {
        BrowserUtils.login();
    }
    @When("the user clicks the {string} module meiyin")
    public void the_user_clicks_the_module_meiyin(String name) {
        BrowserUtils.clickOneOfTheHeaderOptions(name);
    }
    @When("user clicks the add icon on the top meiyin")
    public void user_clicks_the_add_icon_on_the_top_meiyin() {
        BrowserUtils.sleep(2);
        filesPage.addIcon.click();
        BrowserUtils.sleep(2);
    }
    @When("user click {string} meiyin")
    public void user_click_meiyin(String string) {
        BrowserUtils.sleep(2);
        filesPage.newFolderButton.click();
        BrowserUtils.sleep(2);
    }
    @When("user write a folder name meiyin")
    public void user_write_a_folder_name_meiyin() {
        filesPage.typeInput.sendKeys("Java folder");
    }
    @When("the user click submit icon meiyin")
    public void the_user_click_submit_icon_meiyin() {
        filesPage.submitButton.click();
        BrowserUtils.sleep(8);
    }
    @Then("Verify the folder is displayed on the page meiyin")
    public void verify_the_folder_is_displayed_on_the_page_meiyin() {
        System.out.println(filesPage.folderName.getText());
        Assert.assertTrue(filesPage.folderName.getText().equals("Java folder"));

    }

}
