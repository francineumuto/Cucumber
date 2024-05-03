package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddAccount;
import page.TestBase;

public class AddAccountStepDefinition extends TestBase {

	AddAccount addAccountpage;

	@Before
	public void beforeRun() {

		initDriver();
		addAccountpage = new AddAccount(driver);
		addAccountpage = PageFactory.initElements(driver, addAccountpage.getClass());
	}

	@Given("user is on the codefios AddAccount page")
	public void User_is_on_codefios_AddAccount_page() {
		driver.get("https://codefios.com/ebilling/login");
	}

	@When("User enters user as {string}")
	public void UserEntersUser(String user) {
		addAccountpage = PageFactory.initElements(driver, AddAccount.class);
		addAccountpage.enterUserName(user);
	}

	@When("User enters pass as {string}")
	public void UserEntersPasswordAs(String pass) {
		addAccountpage.enterPassword(pass);
	}

	@When("user clicks sign in button")
	public void user_clicks_sign_in_button() {
		addAccountpage.clickSignInButton();
	}

	@When("user click ListAccount button")
	public void user_navigates_to_list_accounts() {
		addAccountpage.navigateToListAccounts();
	}

	@When("user click addAccount accountName as {string} and initialBalance as {string} and accountNumber as {string}")
	public void user_click_addAccount(String accountName, String initialBalance, String accountNumber) {

		addAccountpage.addNewAccount(accountName, initialBalance, accountNumber);

	}

	@When("user click save button")
	public void user_click_saveButton() {
		addAccountpage.clickSave();
	}

	@Then("the account should be created successfully")
	public void account_should_be_added_successfully() {

	}

}
