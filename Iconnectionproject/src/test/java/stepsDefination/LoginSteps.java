package stepsDefination;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import pageObject.LogoutPage;

public class LoginSteps {
	LoginPage Lp;
	LogoutPage LGP;
	@Given("User is in the iconnection login page")
	public void user_iconnection_login_page() {
		BaseClass.getLogger().info("user is in iconnection login page");
		Lp=new LoginPage(BaseClass.getDriver());
		
	}

	@When("the user needs to enter the credentials to respective fields\\(USN: {string}, PWD: {string})")
	public void user_needs_to_enter_the_credentials_to_respective_fields_usn_pwd(String USN, String PWD)
			throws InterruptedException {
		BaseClass.getLogger().info("user entered the data into the respected field");
		Lp.Enter_username(USN);
		Lp.Enter_password(PWD);
		Lp.Enter_continue();
		Thread.sleep(20000);
	}

	@When("the user needs to enter OTP")
	public void the_user_needs_to_enter_otp() {
		BaseClass.getLogger().info("user entered OTP in respected filed");
	}

	@When("user needs to click on continue button")
	public void user_needs_to_click_on_continue_button() throws InterruptedException {
		BaseClass.getLogger().info("user is clicked on continue button");
		Lp.Enter_continue();
		Thread.sleep(10000);
	}

	@Then("user is re-directed to InvestorPortal page")
	public void user_is_re_directed_InvestorPortal_page() throws InterruptedException {
		BaseClass.getLogger().info("user is re-directed succesfully to Investorportal table page");
		boolean status = Lp.Verify_iconnection_logo();
		Assert.assertEquals(status, true);
		Thread.sleep(10000);
		LGP=new LogoutPage(BaseClass.getDriver());
		LGP.Click_Profile_dropdown();
		Thread.sleep(5000);
	}

	@Then("user needs to logout")
	public void user_logout_page() throws InterruptedException {
		BaseClass.getLogger().info("user is logged out succesfully");
		LGP.Click_On_Logout();
		Thread.sleep(5000);
	
	}
}
