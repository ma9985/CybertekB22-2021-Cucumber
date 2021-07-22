package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sun.java2d.pipe.DrawImage;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    LibraryLoginPage loginPage = new LibraryLoginPage();

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {

        System.out.println("list of fruits" + listOfFruits.size());
        System.out.println(listOfFruits);
    }

    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
       String url = ConfigurationReader.getProperty("LibraryUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {
        String username = loginInfo.get("username");
        //String password = loginInfo.get("password");

        loginPage.emailInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(loginInfo.get("password"));

        loginPage.signIn.click();

    }
    @Then("user should see title is Library")
    public void use_should_see_title_is_something() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

    }

}
