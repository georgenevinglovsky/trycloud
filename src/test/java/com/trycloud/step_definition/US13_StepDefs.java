package com.trycloud.step_definition;


import com.trycloud.page.DashboardPage_HV;
import com.trycloud.page.LoginPage;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13_StepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("user logged in to the appHV")
    public void user_logged_in_to_the_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginbtn.click();
    }
    DashboardPage_HV dashboardPage_hv = new DashboardPage_HV();
    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        dashboardPage_hv.magnifier.click();
    }
    @When("users search any {string} in existing file,folder,user name")
    public void users_search_any_in_existing_file_folder_user_name(String string) {

        dashboardPage_hv.searchField.sendKeys(string);
    }
    @Then("verify the app displays {string} in the expected result option")
    public void verify_the_app_displays_in_the_expected_result_option(String string) {
        BrowserUtils.sleep(4);
        Assert.assertTrue(dashboardPage_hv.searchResult.getText().toLowerCase().contains(string));
    }


}
