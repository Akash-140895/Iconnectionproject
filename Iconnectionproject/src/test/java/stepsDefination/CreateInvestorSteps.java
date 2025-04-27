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

	@Given("User is in Investors table page")
	public void user_is_in_investors_table_page() {

	}

	@Given("user needs to click on Add investor button")
	public void user_needs_to_click_on_add_investor_button() {
		ITP = new InvestorTablePage(BaseClass.getDriver());
		ITP.Click_AddInvestor();

	}

	@When("user navigate to Investor KYC screen")
	public void user_navigate_to_investor_kyc_screen() {

	}

	@When("user needs to input all the data to respected fields")
	public void user_needs_to_input_all_the_data_to_respected_fields() {
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
	public void user_click_on_cancel_button() {
		WDP = new WiringDetailsPage(BaseClass.getDriver());
		WDP.Scrollcontinue();
		WDP.ClickCancel();
		WDP.SFrame();

	}

	@Then("user click on leavepage button")
	public void user_click_on_leavepage_button() {
		WDP.ClickLeavepage();

	}

	@Given("User back to Investors table page")
	public void user_back_to_investors_table_page() {

	}

}
