package com.trycloud.step_definition;

import com.trycloud.page.WriteCommentsPage_FS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class US11_WriteComments_StepDef {
    
WriteCommentsPage_FS commentsOnFile = new WriteCommentsPage_FS();


    @And("user click action-icon  from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        commentsOnFile.dotDotDotIcon.click();
    }

    @And("user write a {string} inside the input box")
    public void userWriteAInsideTheInputBox(String comments) {
       WebElement enterComments = commentsOnFile.commentsButton;
        enterComments.sendKeys(comments);
    }

    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {
        commentsOnFile.commentsButton.click();
    }

    @Then("Verify the comment is displayed in the comment section")
    public void verifyTheCommentIsDisplayedInTheCommentSection() {
    }


}
