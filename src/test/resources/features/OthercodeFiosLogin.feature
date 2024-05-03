@OthercodeFiosLoginFeatures @Regression
Feature: codeFios login page functionality validation

Background: 
    Given User is on codefios login page
     When User enters username as "demo@codefios.com"

@Other_Scenario
Scenario: User should be able to login with valid credentials(Other)
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User lands on dashboard page
