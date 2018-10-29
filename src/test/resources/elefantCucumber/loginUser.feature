
Feature: loginUser


  Scenario: Login user
    When I open elefant.ro website
    And navigate to login fields
    And I fill login fields on the form and submit
    Then I should see successfully submitted
    And I logout from account



