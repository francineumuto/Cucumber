package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddAccount {

	WebDriver driver;

	public AddAccount(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SignInButton;

	@FindBy(how = How.XPATH, using = "//div[@class='panel-title']")
	WebElement Dashboard;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='List Accounts']")
	WebElement ListAccout;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add Account']")
	WebElement AddAccountButton;
	@FindBy(how = How.XPATH, using = "//input[@id='account_name']")
	WebElement AccountNameField;

	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalanceField;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumberField;
	@FindBy(how = How.XPATH, using = "//button[@id='accountSave']")
	WebElement SaveButton;

	public void enterUserName(String username) {
		UserName.sendKeys(username);
	}

	public void clickSignInButton() {
		SignInButton.click();
	}

	public void navigateToListAccounts() {

		Dashboard.click();
		ListAccout.click();
	}

	public void addNewAccount(String accountName, String initialBalance, String accountNumber) {
		AddAccountButton.click();
		AccountNameField.sendKeys(accountName);
		InitialBalanceField.sendKeys(initialBalance);
		AccountNumberField.sendKeys(accountNumber);
		
	}

	public void enterPassword(String password) {
		   Password.sendKeys(password);
		
	}
	
	public void clickSave() {
		SaveButton.click();
	}
}
