package com.trycloud.step_definition;

import com.trycloud.page.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_StepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user input correct username")
    public void user_input_correct_username() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user input correct password")
    public void user_input_correct_password() {
       loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("click login button")
    public void click_login_button() {
        loginPage.loginbtn.click();
    }
    @Then("user should see the home page")
    public void user_should_see_the_home_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigurationReader.getProperty("homepageTitle")));
    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String errorMessage) {
        Assert.assertTrue(errorMessage.equals(loginPage.errorMessage.getText()));
    }
}
