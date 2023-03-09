package com.trycloud.step_definition;

import com.trycloud.page.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US12_FilesSettings_StepDefs {
    FilesPage filesPage = new FilesPage();

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        filesPage.settingButton.click();
        BrowserUtils.sleep(1);

    }

    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {
        if(filesPage.showRichWorkspacesToggle.isSelected()){
            filesPage.showRichWorkspacesToggleLabel.click();
            BrowserUtils.sleep(1);
        }
        if(filesPage.recommendationsEnabledToggle.isSelected()){
            filesPage.recommendationsEnabledTogglLabel.click();
            BrowserUtils.sleep(1);
        }
        if(filesPage.showhiddenfilesToggle.isSelected()){
            filesPage.showhiddenfilesToggleLabel.click();
            BrowserUtils.sleep(3);
        }
        Driver.getDriver().navigate().refresh();
        filesPage.settingButton.click();
        BrowserUtils.sleep(3);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        filesPage.showRichWorkspacesToggleLabel.click();

        WebElement element = wait.until(ExpectedConditions.visibilityOf(filesPage.notesParagraph));
        filesPage.recommendationsEnabledTogglLabel.click();
        element = wait.until(ExpectedConditions.visibilityOf(filesPage.recommendations));
        filesPage.showhiddenfilesToggleLabel.click();


        Assert.assertTrue(filesPage.showRichWorkspacesToggle.isSelected());
        Assert.assertTrue(filesPage.recommendationsEnabledToggle.isSelected());
        Assert.assertTrue(filesPage.showhiddenfilesToggle.isSelected());


    }
}
