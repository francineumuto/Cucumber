@NegativeLoginFeature @Regression
Feature: codeFios login page functionality validation

Background: 
    Given User is on codefios login page
     

@NegativeLoginScenario1
Scenario: 1 User should be able to login with valid credentials
    When User enters username as "<userName>"
    When User enters password as "<Password>"
    When User clicks on sign in button
    Then User lands on dashboard page
    
    
#@NegativeLoginScenario2
#Scenario: 1 User should be able to login with valid credentials
    #When User enters username as "<demo@codefios.com>"
    #When User enters password as "<abc123>"
    #When User clicks on sign in button
    #Then User lands on dashboard page  
    #
#@NegativeLoginScenario3
#Scenario: 2 User should be able to login with valid credentials
    #When User enters username as "demo@codefios.com"
    #When User enters password as "abc124"
    #When User clicks on sign in button
    #Then User lands on dashboard page
    #
#@NegativeLoginScenario4
#Scenario: 2 User should be able to login with valid credentials
    #When User enters username as "demo@codefios.com"
    #When User enters password as ""
    #When User clicks on sign in button
    #Then User lands on dashboard page
       