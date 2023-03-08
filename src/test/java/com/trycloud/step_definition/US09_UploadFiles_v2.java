package com.trycloud.step_definition;

import com.trycloud.page.DashboardPage;
import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US09_UploadFiles_v2 {
DashboardPage dashboardPage = new DashboardPage();
FilesPage filesPage = new FilesPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        BrowserUtils.login();
        BrowserUtils.sleep(2);

    }

    @When("the user clicks  the {string} module")
    public void theUserClicksTheModule(String file) {
     BrowserUtils.clickOneOfTheHeaderOptions(file);

    }
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        BrowserUtils.sleep(3);
      filesPage.foldersList.get(0).click();

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.sleep(2);
      filesPage.addIcon.click();
    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        BrowserUtils.sleep(2);
        filesPage.uploadButton.sendKeys("C:\\Users\\Kaihan\\Desktop\\FunStuff\\Locations.txt");
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.sleep(3);
    Assert.assertTrue(filesPage.newUploadedFile.getText().equals("Locations"));
    }

}
