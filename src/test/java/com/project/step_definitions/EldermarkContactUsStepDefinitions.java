package com.project.step_definitions;

import com.github.javafaker.Faker;
import com.project.pages.ContactUsPage;
import com.project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EldermarkContactUsStepDefinitions {

    ContactUsPage contactUsPage;
    Actions actions;
    Wait wait;

    @Given("I am on the Eldermark support page")
    public void i_am_on_the_eldermark_support_page() {
        Driver.getDriver().get("https://www.eldermark.com/support/");
    }

    @When("I fill in the contact form with valid information")
    public void i_fill_in_the_contact_form_with_valid_information() {
        actions = new Actions(Driver.getDriver());
        contactUsPage = new ContactUsPage();

        contactUsPage.firstNameInput.sendKeys(Faker.instance().name().firstName());
        contactUsPage.lastNameInput.sendKeys(Faker.instance().name().lastName());
        contactUsPage.emailInput.sendKeys(Faker.instance().internet().emailAddress().replace("@", ""));
        contactUsPage.phoneNameInput.sendKeys(Faker.instance().phoneNumber().phoneNumber());
        contactUsPage.messageInput.sendKeys(Faker.instance().lorem().sentence(5));

    }
    @When("I click the {string} button")
    public void i_click_the_button(String string) {
        contactUsPage = new ContactUsPage();
        actions = new Actions(Driver.getDriver());
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.submitButton));
        actions.moveToElement(contactUsPage.submitButton).click().perform();

        contactUsPage.submitButton.click();



    }
    @Then("I should see a success message")
    public void i_should_see_a_success_message() {

        contactUsPage = new ContactUsPage();
        Assert.assertEquals("Email must be formatted correctly.", contactUsPage.emailErrorMessage.getText() );

    }

}
