package com.trycloud.step_definition;

import com.trycloud.page.FilesPage_AO;
import com.trycloud.page.MainModulesPage_AO;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US05_AddFavorites_StepDefs {

    @Given("user on the home page AO")
    public void user_on_the_home_page() {
        US01_StepDefs us01_stepDefs = new US01_StepDefs();
        us01_stepDefs.user_is_on_login_page();
        us01_stepDefs.user_input_correct_username();
        us01_stepDefs.user_input_correct_password();
        us01_stepDefs.click_login_button();



    }

    MainModulesPage_AO mainModulesPage_ao = new MainModulesPage_AO();

    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {
        mainModulesPage_ao.filesButton.click();
    }

    FilesPage_AO filesPage_ao = new FilesPage_AO();


    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(5);
        filesPage_ao.actionButton.click();
    }
    @When("user choose the Add to favorites option")
    public void user_choose_the_option() {

    }
    @When("user click the Favorites sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side() {

    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {


    }
}

