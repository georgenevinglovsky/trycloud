package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_CreateFolders {
    FilesPage filesPage = new FilesPage();

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.sleep(2);
        filesPage.addIcon.click();
        BrowserUtils.sleep(2);
    }
    @When("user click {string}")
    public void user_click(String string) {
        BrowserUtils.sleep(2);
        filesPage.newFolderButton.click();
        BrowserUtils.sleep(2);


    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
        filesPage.typeInput.sendKeys("Java folder");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.submitButton.click();
        BrowserUtils.sleep(8);

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        System.out.println(filesPage.folderName.getText());
        Assert.assertTrue(filesPage.folderName.getText().equals("Java folder"));
    }
}
