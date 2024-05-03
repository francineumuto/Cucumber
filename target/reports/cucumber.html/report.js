$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddAccount.feature");
formatter.feature({
  "name": "Add Account functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddAccountFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the codefios AddAccount page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.User_is_on_codefios_AddAccount_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddAccountFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@AddAccountScenario1"
    }
  ]
});
formatter.step({
  "name": "User enters user as \"demo@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.UserEntersUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters pass as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.UserEntersPasswordAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_lands_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the codefios AddAccount page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.User_is_on_codefios_AddAccount_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User adds should be able to add a new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddAccountFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@AddAccountScenario2"
    }
  ]
});
formatter.step({
  "name": "User enters user as \"demo@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.UserEntersUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters pass as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.UserEntersPasswordAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_lands_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click ListAccount button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.user_navigates_to_list_accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click addAccount accountName as \"Francine\" and initialBalance as \"80000\" and accountNumber as \"98754554\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.user_click_addAccount(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.user_click_saveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the account should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.AddAccountStepDefinition.account_should_be_added_successfully()"
});
formatter.result({
  "status": "passed"
});
});