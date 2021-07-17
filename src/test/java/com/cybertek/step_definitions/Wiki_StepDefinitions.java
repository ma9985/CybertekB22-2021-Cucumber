package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiSearchPage.searchBox.sendKeys(arg0);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = arg0 + " - Wikipedia";
        Assert.assertEquals("Title is not as expected", actualTitle, expectedTitle);
    }

    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String arg0) {

        String expectedHeader = arg0;
        String actualHeader = wikiSearchPage.mainHeader.getText();

        Assert.assertEquals(expectedHeader, actualHeader);
    }
}