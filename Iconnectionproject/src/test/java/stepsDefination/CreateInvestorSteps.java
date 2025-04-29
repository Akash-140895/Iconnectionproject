package stepsDefination;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.InvestorKYCForm;
import pageObject.InvestorTablePage;
import pageObject.LoginPage;
import pageObject.LogoutPage;
import pageObject.WiringDetailsPage;

public class CreateInvestorSteps extends BaseClass {
	InvestorTablePage ITP;
	InvestorKYCForm IKF;
	WiringDetailsPage WDP;
	LoginPage Lp;
	LogoutPage LGP;

	@Given("User needs to navigate to Investors table page")
	public void user_needs_to_navigate_investors_table_page() 
	{
		BaseClass.getLogger().info("user is in iconnection login page");
		Lp=new LoginPage(BaseClass.getDriver());
		
	}
	@Given("user needs to enter the inputs\\(User: {string}, Pass: {string})")
	public void user_needs_to_enter_the_inputs(String User,String Pass) throws InterruptedException {
		BaseClass.getLogger().info("user entered the data into the respected field");
		Lp.Enter_username(User);
		Lp.Enter_password(Pass);
		Lp.Enter_continue();
		BaseClass.getLogger().info("user entered OTP in respected field");
		Thread.sleep(20000);
		BaseClass.getLogger().info("user is clicked on continue button");
		Lp.Enter_continue();
		Thread.sleep(10000);
		BaseClass.getLogger().info("user is re-directed succesfully to Investorportal table page");
	}

	@When("user needs to click on Add investor button")
	public void user_needs_to_click_on_add_investor_button() {
		ITP = new InvestorTablePage(BaseClass.getDriver());
		ITP.Click_AddInvestor();

	}

	@When("user navigate to Investor KYC screen")
	public void user_navigate_to_investor_kyc_screen() {

	}

	@When("user needs to input all the data to respected fields")
	public void user_needs_to_input_all_the_data_to_respected_fields() 
	{
		IKF = new InvestorKYCForm(BaseClass.getDriver());
		IKF.InvestorType();
		IKF.SelectInvestorType();
		IKF.PFType();
		IKF.PFContent();
		IKF.InputFName("Akash");
		IKF.InputLName("R");
		IKF.InputEmail("akash@gmail.com");

	}

	@When("user needs to click continue button")
	public void user_needs_to_click_continue_button() {
		IKF.ClickContinue();
	}

	@Then("user navigate to wiring details screen")
	public void user_navigate_to_wiring_details_screen() {

	}

	@Then("user click on cancel button")
	public void user_click_on_cancel_button() 
	{
		WDP = new WiringDetailsPage(BaseClass.getDriver());
		WDP.Scrollcontinue();
		WDP.ClickCancel();
		

	}

	@Then("user click on leavepage button")
	public void user_click_on_leavepage_button() 
	{
		//WDP.SFrame();
		WDP.ClickLeavepage();

	}

	@Given("User back to Investors table page")
	public void user_back_to_investors_table_page() {

	}
	@Given("user needs to logout from the application")
	public void user_logout_() throws InterruptedException 
	{
		Thread.sleep(10000);
		LGP=new LogoutPage(BaseClass.getDriver());
		LGP.Click_Profile_dropdown();
		Thread.sleep(5000);
		BaseClass.getLogger().info("user is logged out succesfully");
		LGP.Click_On_Logout();
		Thread.sleep(5000);

	}

}
