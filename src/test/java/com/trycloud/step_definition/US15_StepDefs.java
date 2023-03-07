package com.trycloud.step_definition;

import com.trycloud.page.DashboardPage;
import com.trycloud.page.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US15_StepDefs {

    @Given("user is logged to the Application")
    public void user_is_logged_to_the_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }
    DashboardPage dashboardPage = new DashboardPage();
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        dashboardPage.clickOneOfTheDashboardOptions(string);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(string.equals(actual));
    }

}
