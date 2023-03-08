package com.trycloud.step_definition;

import com.trycloud.page.DashboardPage;
import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;


public class US07_UploadAFile_v2 {
    FilesPage filesPage = new FilesPage();


    @When("the user clicks the add icon one the top")
    public void the_user_clicks_the_add_icon_one_the_top() {
        BrowserUtils.sleep(2);
        filesPage.addIcon.click();
        BrowserUtils.sleep(2);

    }
    @When("users uploads file with the {string} option")
    public void users_uploads_file_with_the_option(String expectedText) {
        String actualHeaderText = filesPage.uploadFile.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualHeaderText, expectedText);

    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(filesPage.uploadFile.isDisplayed());

    }
}
