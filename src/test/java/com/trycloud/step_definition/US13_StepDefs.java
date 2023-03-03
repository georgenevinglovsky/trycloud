package com.trycloud.step_definition;

import com.trycloud.page.DashboardPage_HV;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13_StepDefs {
    @Given("user logged in to the app")
    public void user_logged_in_to_the_app() {
       US01_StepDefs us01_stepDefs = new US01_StepDefs();
       us01_stepDefs.user_is_on_login_page();
       us01_stepDefs.user_input_correct_username();
       us01_stepDefs.user_input_correct_password();
       us01_stepDefs.click_login_button();
    }
    DashboardPage_HV dashboardPageHV = new DashboardPage_HV();
    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {

        dashboardPageHV.magnifier.click();

    }

    @And("users search {string} in any existing file,folder,user name")
    public void usersSearchAnyExistingFileFolderUserName(String searchWord) {
        dashboardPageHV.searchField.sendKeys(searchWord);
    }



    @Then("verify the app displays the {string} in expected result option")
    public void verify_the_app_displays_the_expected_result_option(String expectedResult) {
        BrowserUtils.sleep(3);
        Assert.assertTrue(dashboardPageHV.searchResult.getText().equalsIgnoreCase(expectedResult));

    }


}
