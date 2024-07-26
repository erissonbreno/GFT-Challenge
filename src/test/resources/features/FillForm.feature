Feature: Form
  Scenario: Fill form and validate the success message
    Given I navigate to "https://automationexercise.com/contact_us"
    When I fill the name as "John"
    And I fill the email as "John@john.com"
    And I fill the subject as "GFT Automation"
    And I fill the message as "This is a GFT Challenge"
    And I submit the form
    Then I should see the message "Success! Your details have been submitted successfully."