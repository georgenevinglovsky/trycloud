package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_UploadAFile_v2 {

    FilesPage filesPage = new FilesPage();





    @When("the user clicks the {string} module aimaiti")
    public void theUserClicksTheModuleAimaiti(String name) {
        BrowserUtils.clickOneOfTheHeaderOptions(name);
    }

    @When("the user clicks the add icon one the top aimaiti")
    public void theUserClicksTheAddIconOneTheTopAimaiti() {
        BrowserUtils.sleep(2);
        filesPage.addIcon.click();
        BrowserUtils.sleep(2);
    }

    @And("users uploads file with the {string} option aimaiti")
    public void usersUploadsFileWithTheOptionAimaiti(String expectedText) {
        String actualHeaderText = filesPage.uploadFile.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualHeaderText, expectedText);
    }

    @Then("verify the file is displayed on the page aimiati")
    public void verifyTheFileIsDisplayedOnThePageAimiati() {
        Assert.assertTrue(filesPage.uploadFile.isDisplayed());
    }
}

