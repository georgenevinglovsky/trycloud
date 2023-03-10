package com.trycloud.step_definition;

import com.trycloud.page.WriteCommentsPage_FS;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_WriteComments_StepDef {

    WriteCommentsPage_FS commentsOnFile = new WriteCommentsPage_FS();


    @When("Users be able to click on {string} module and landing on Files page")
    public void usersBeAbleToClickOnModuleAndLandingOnFilesPage(String files) {
        commentsOnFile.DashBordMenu(files);
    }

    @When("Users should be able to click on dot dot dot ... icon on each file list")
    public void users_should_be_able_to_click_on_dot_dot_dot_icon_on_each_file_list() {
        BrowserUtils.sleep(3);
        commentsOnFile.dotDotDotIcon.click();
    }

    @When("Users should be able to click on {string} After actions menu show up")
    public void users_should_be_able_to_click_on_after_actions_menu_show_up(String Details) {
        commentsOnFile.ActionsMenuOnFiles(Details);
    }

    @And("User should be able to click on {string}")
    public void userShouldBeAbleToClickOn(String commentsTabView) {
        BrowserUtils.sleep(3);
        commentsOnFile.TabView(commentsTabView);
    }

    @When("Users should be able to write {string} and click post the comment")
    public void users_should_be_able_to_write_and_click_post_the_comment(String comments) {
            WebElement enterComments = commentsOnFile.commentsButton;
            enterComments.sendKeys(comments);
            commentsOnFile.postButton.click();
    }

    @Then("The posted comments should displayed under comment box")
    public void thePostedCommentsShouldDisplayedUnderCommentBox() {
        Assert.assertTrue(commentsOnFile.postedComments.isDisplayed());
    }
}
