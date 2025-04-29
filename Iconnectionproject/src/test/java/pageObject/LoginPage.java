package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver){
		super(driver);
	}
	// Elements
	@FindBy(xpath = "//input[@id='username']")
	WebElement User_text;
	@FindBy(xpath = "//input[@id='password']")
	WebElement User_psw;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement Click_continue;
	@FindBy(xpath = "//div[@class='iconn_svg']//*[name()='svg']")
	WebElement verify_logo;

	// Action methods
	public void Enter_username(String USN) {
		User_text.sendKeys(USN);
	}
	public void Enter_password(String PWD) {
		User_psw.sendKeys(PWD);
	}
	public void Enter_continue() {
		Click_continue.click();
	}
	public boolean Verify_iconnection_logo() {
		return verify_logo.isDisplayed();
	}
}
