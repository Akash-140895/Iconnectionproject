package stepsDefination;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.InvestorTablePage;
import pageObject.LoginPage;
import pageObject.LogoutPage;
import utilities.DataReader;

public class LoginDDTsteps {
	WebDriver driver;
	InvestorTablePage ITP;
	LoginPage lp;
	List<HashMap<String, String>> datamap;

	@Given("The user navigates to login page")
	public void navigates_to_login_page() {
		BaseClass.getLogger().info("user is in iconnection login page");
		
		
	}
	@Then("the user should be redirected to investor screen by passing email and password with excel row {string}")
	public void user_redirected_to_investor_screen(String rows) throws InterruptedException {
		BaseClass.getLogger().info("data driven start");
		try {
			datamap = DataReader.data(System.getProperty("user.dir") + "/TestData/LoginData.xlsx", "sheet1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int index = Integer.parseInt(rows) - 1;
		String email = datamap.get(index).get("Username");
		String pwd = datamap.get(index).get("Password");
		String exp_res = datamap.get(index).get("Result");
		lp = new LoginPage(BaseClass.getDriver());
		lp.Enter_username(email);
		lp.Enter_password(pwd);
		lp.Enter_continue();
		if(lp.Verify_Otp()) 
		{
			Thread.sleep(20000);
			lp.Enter_continue();
		}
		else 
		{
			System.out.println("Username and password are invalid");
		}
		try {
			ITP = new InvestorTablePage(BaseClass.getDriver());
			boolean targetpage = ITP.InvestorTablePageExists();
			System.out.println("target page:" + targetpage);
			if (exp_res.equalsIgnoreCase("valid")) 
			{
				if (targetpage == true) {
					LogoutPage lgp = new LogoutPage(BaseClass.getDriver());
					lgp.Click_Profile_dropdown();
					Thread.sleep(10000);
					lgp.Click_On_Logout();
					Assert.assertTrue(true);
				} 
				else 
				{
					Assert.assertTrue(false);
				}
			}
			if (exp_res.equalsIgnoreCase("invalid")) 
			{
				if (targetpage == true) 
				{
					Assert.assertTrue(false);
				} 
				else 
				{
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) 
		{
			Assert.assertTrue(false);
		}

	}
}
