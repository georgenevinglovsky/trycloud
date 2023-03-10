package com.trycloud.step_definition;
import com.trycloud.page.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
public class US03_MainModules_StepDefs
{    DashboardPage dashboardPage = new DashboardPage();
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> list) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(dashboardPage.dashboard.isDisplayed());
        Assert.assertTrue(dashboardPage.Files.isDisplayed());
        Assert.assertTrue(dashboardPage.Photos.isDisplayed());
        Assert.assertTrue(dashboardPage.Activity.isDisplayed());
        Assert.assertTrue(dashboardPage.Talk.isDisplayed());
        Assert.assertTrue(dashboardPage.Contacts.isDisplayed());
        Assert.assertTrue(dashboardPage.Circles.isDisplayed());
        Assert.assertTrue(dashboardPage.Calendar.isDisplayed());
        Assert.assertTrue(dashboardPage.Deck.isDisplayed());    }}

