package com.trycloud.step_definition;

import com.trycloud.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US10_FileModule {
LoginPage loginPage =new LoginPage();
    @Given(": user logged in successfully and on the home page")
    public void user_logged_in_successfully_and_on_the_home_page() {
        loginPage.login();
    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user choose the Delete folder option")
    public void user_choose_the_delete_folder_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks the Deleted folder sub-module on the left side")
    public void the_user_clicks_the_deleted_folder_sub_module_on_the_left_side() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the deleted file is displayed on the Deleted Files page.")
    public void verify_the_deleted_file_is_displayed_on_the_deleted_files_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
