package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WiringDetailsPage extends BasePage
{
	WebDriverWait mywait;
	public WiringDetailsPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//iframe[@id='intercom-frame']") WebElement switch_frame;
	@FindBy(xpath="//p[normalize-space()='Cancel']") WebElement click_cancel ;
	@FindBy(xpath="//span[contains(@class,'v-btn__content')]//p[contains(text(),'Leave the page')]") WebElement click_leave ;
	@FindBy(xpath="//button[contains(@class,'v-btn v-btn--elevated v-theme--light v-btn--density-default v-btn--size-default v-btn--variant-elevated button button_lg button_primary')]") WebElement src_continue;
	public void Scrollcontinue() 
	{
	 JavascriptExecutor Js= (JavascriptExecutor)driver;
	 Js.executeScript("arguments[0].scrollIntoView(true);", src_continue);
	}
	public void ClickCancel() 
	{
		//click_cancel.click();
		mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(click_cancel)).click();
	}
	public void SFrame() 
	{
		driver.switchTo().frame(switch_frame);
	}
	public void ClickLeavepage() 
	{
		//click_leave.click();
		mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(click_leave)).click();
	}
}
