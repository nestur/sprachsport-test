package com.sprachsport.step_definitions;

import com.sprachsport.utilities.ConfigurationReader;
import com.sprachsport.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class NavigateMenuStepDef {
    @Given("the user is on the Startseite")
    public void the_user_is_on_the_Startseite() {
        Driver.get().get("https://sprachsport.com/");
    Assert.assertEquals(ConfigurationReader.get("startseite_url"),Driver.get().getCurrentUrl()
        );
    }

    @When("the user clicks the Startseite button")
    public void the_user_clicks_the_Startseite_button() {
        Driver.get().findElement(By.className("menu-text")).click();

    }

    @Then("the user is on the Startseite page")
    public void the_user_is_on_the_Startseite_page() {
    Assert.assertEquals(ConfigurationReader.get("startseite_url"),Driver.get().getCurrentUrl());

    }

    @When("the user clicks the Unser Konzept button")
    public void the_user_clicks_the_Unser_Konzept_button() {
    Driver.get().findElement(By.linkText("Unser Konzept")).click();
    }

    @Then("the user is on the Unser Konzept page")
    public void the_user_is_on_the_Unser_Konzept_page() {
        Assert.assertEquals(ConfigurationReader.get("unserkonzept_url"),Driver.get().getCurrentUrl());

    }

    @When("the user clicks the Team button")
    public void the_user_clicks_the_Team_button() {
    Driver.get().findElement(By.linkText("Team")).click();
    }

    @Then("the user is on the Team page")
    public void the_user_is_on_the_Team_page() {
        Assert.assertEquals(ConfigurationReader.get("team_url"),Driver.get().getCurrentUrl());

    }

    @When("the user clicks the Kontakt button")
    public void the_user_clicks_the_Kontakt_button() {
        Driver.get().findElement(By.linkText("Kontakt")).click();
    }

    @Then("the user is on the Kontakt page")
    public void the_user_is_on_the_Kontakt_page() {
        Assert.assertEquals(ConfigurationReader.get("kontakt_url"),Driver.get().getCurrentUrl());

    }
}
