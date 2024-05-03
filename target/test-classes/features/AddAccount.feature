@AddAccountFeature @Regression
Feature: Add Account functionality validation
       
       
Background: 
    Given user is on the codefios AddAccount page
       
@AddAccountScenario1  
Scenario: User should be able to login with valid credentials
    When User enters user as "demo@codefios.com"
    When User enters pass as "abc123"
    When User clicks on sign in button
    Then User lands on dashboard page      

@AddAccountScenario2
Scenario: User adds should be able to add a new account
		When User enters user as "demo@codefios.com"
    When User enters pass as "abc123"
    When User clicks on sign in button
    Then User lands on dashboard page 
    When user click ListAccount button
    When user click addAccount accountName as "Francine" and initialBalance as "80000" and accountNumber as "98754554" 
    When user click save button
    Then the account should be created successfully