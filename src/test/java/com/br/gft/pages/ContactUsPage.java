package com.br.gft.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ContactUsPage {

    private final SelenideElement nameInput = $(byXpath("//input[@data-qa='name']"));
    private final SelenideElement emailInput = $(byXpath("//input[@data-qa='email']"));
    private final SelenideElement subjectInput = $(byXpath("//input[@data-qa='subject']"));
    private final SelenideElement messageTextArea = $(byXpath("//textarea[@data-qa='message']"));
    private final SelenideElement submitButton = $(byXpath("//input[@data-qa='submit-button']"));
    private final SelenideElement successMessage = $(byXpath("//div[@class = 'status alert alert-success']"));

    public void fillName(String name) {
        nameInput.setValue(name);
    }

    public void fillEmail(String email) {
        emailInput.setValue(email);
    }

    public void fillSubject(String subject) {
        subjectInput.setValue(subject);
    }

    public void fillMessage(String message) {
        messageTextArea.setValue(message);
    }

    public void submitForm() {
        scrollToBottom();
        submitButton.click();
        switchTo().alert().accept();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    private void scrollToBottom() {
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
