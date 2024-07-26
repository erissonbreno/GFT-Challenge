package com.br.gft.steps;

import com.br.gft.pages.ContactUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;


public class FormStep {

    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        open(url);
    }

    @When("I fill the name as {string}")
    public void i_fill_the_name_as(String name) {
        contactUsPage.fillName(name);
    }

    @When("I fill the email as {string}")
    public void i_fill_the_email_as(String email) {
        contactUsPage.fillEmail(email);
    }

    @When("I fill the subject as {string}")
    public void i_fill_the_subject_as(String subject) {
        contactUsPage.fillSubject(subject);
    }

    @When("I fill the message as {string}")
    public void i_fill_the_message_as(String message) {
        contactUsPage.fillMessage(message);
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        contactUsPage.submitForm();
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expectedMessage) {
        assertEquals(expectedMessage, contactUsPage.getSuccessMessage());
    }

}
