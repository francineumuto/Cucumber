package steps;

import org.openqa.selenium.support.PageFactory;



import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import page.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
//	DataBase database;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = new LoginPage(driver);
		loginPage = PageFactory.initElements(driver, loginPage.getClass());
//		database = new DataBase();
	}

	@Given("User is on codefios login page")
	public void User_is_on_codefios_login_page() {

		driver.get("https://codefios.com/ebilling/login");
		takeScreenShot(driver);

	}

	@When("User enters username as {string}")
	public void UserEntersUsernameAs(String userName) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);

	}

//	@When("User enters String from mysql database")
//	
//	public void user_enters_from_mysql_database(String logininfo) {
//		if (logininfo.equalsIgnoreCase("username")) {
//			loginPage.enterUserName(database.getDataFromDb("user_name"));
//		} else if (logininfo.equalsIgnoreCase("password")) {
//			loginPage.enterPassword(database.getDataFromDb("password"));
//		} else {
//			System.out.println("unable to extract data from Db!!1");
//		}
//
//	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
		takeScreenShot(driver);
	}

	@Then("User lands on dashboard page")
	public void user_lands_on_dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
