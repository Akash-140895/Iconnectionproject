package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
	
	public LogoutPage(WebDriver driver)
	{
		super(driver);
	}
	//Elements
	@FindBy(xpath = "//i[@class='material-icons v-icon notranslate v-theme--light margin-left_xs-df']")
	WebElement Click_dropdown;
	@FindBy(xpath = "//div[@class='d-flex align-center justify-center topBar height_6xl w-100 bg-white']//div[4]//div[2]")
	WebElement Click_logout;
	//@FindBy(xpath ="/span[normalize-space()='Logout']") WebElement Click_logout;
    //Action methods
	
	public void Click_Profile_dropdown() {
		Click_dropdown.click();
	}
	public void Click_On_Logout() {
		Click_logout.click();
	}
}
