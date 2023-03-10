package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US04_FileModule_StepDefs {

    FilesPage filesPage = new FilesPage();




    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesPage.allFilesCheckBox.click();
        BrowserUtils.sleep(5);


    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        for (WebElement each : filesPage.filesCheckboxes) {
            if(each.isSelected()){
                Assert.assertTrue(true);
            }else{
                Assert.assertTrue(false);
            }
        }
    }

    @Then("verify the page title  {string}")
    public void verifyThePageTitle(String arg0) {
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(arg0.equals(actual));
    }
}
