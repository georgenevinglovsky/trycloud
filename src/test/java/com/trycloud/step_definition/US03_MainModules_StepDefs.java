package com.trycloud.step_definition;

import com.trycloud.page.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class US03_MainModules_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();


        @Then("Verify the user see the following modules:")
        public void verify_the_user_see_the_following_modules(ArrayList<String> list) {
            ArrayList<String>modules = new ArrayList<>();
            for (WebElement module : dashboardPage.modules) {
                modules.add(module.getText());
            }
            System.out.println(modules);
            for (int i = 0; i < modules.size(); i++) {
                if (list.contains(modules.get(i))){
                    continue;
                }else{
                    Assert.fail();
                }

            }
            Assert.assertTrue(true);
        }

}
