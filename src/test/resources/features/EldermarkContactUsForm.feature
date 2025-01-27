
Feature: Contact Form Submission

  As a user seeking support,
  I want to be able to submit a request through the contact form on the Eldermark support page,
  So that I can receive assistance with my issue.

  @Max
  Scenario: Submit a support request

    Given I am on the Eldermark support page
    When I fill in the contact form with valid information
    And I click the "Submit" button
    Then I should see a success message


