package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClass.LoginPage;

public class LoginPageStepDefinitions {

	LoginPage lp = new LoginPage();

	@Given("I am the user name of an applications")

	public void Iam() throws Exception {
		lp.openUrl();

	}

	@When("User enter valid userName")
	public void User_enter_valid_userName() {
		lp.enterUserName();
	}

	@When("user enter valid password")
	public void user_enter_valid_password() {
		lp.enterPassword();
	}

	@When("User click on login button")
	public void User_click_on_login_button() {
		lp.clickButton();
	}

	@Then("User should be  able to login successfully")
	public void User_should_be_able_to_login_successfully() {
		lp.verifyLogin();
	}

	@When("User enter invalid userName")
	public void User_enter_invalid_userName() {
		lp.enterUserName();
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
		lp.enterPassword();

	}

}
