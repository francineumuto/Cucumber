@DbLoginFeature @Regression
Feature: codeFios login page functionality validation

Background: 
    Given User is on codefios login page


@DbLoginLoginScenario1
Scenario: User should be able to login with valid credentials
    When User enters "username" from mySql database
    When User enters "password" from mySql database
    When User clicks on sign in button
    Then User lands on dashboard page
    