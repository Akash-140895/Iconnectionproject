package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvestorKYCForm extends BasePage {
	WebDriverWait mywait;
	public InvestorKYCForm(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy (xpath= "//div[@class='dropdown']//p[@class='text-overflow-ellipsis'][normalize-space()='e.g., Limited Liability Company']") WebElement click_type;
	@FindBy(xpath="//div[@class='dropdown--active']//li[1]") WebElement select_type;
	@FindBy(xpath="//p[normalize-space()='Individual that is a United States person']") WebElement click_PF ;
	@FindBy(xpath="//li[normalize-space()='Individual that is a United States person']") WebElement select_content;
	@FindBy(xpath="//p[normalize-space()='Upload investor documents']") WebElement click_upload;
	@FindBy(xpath="//div[@class='pt-6 pb-12 px-10 upload_download-details']//div[2]//div[1]//div[2]//div[3]//div[1]//button[1]//span[3]//p[1]") WebElement click_inv_upload;
	@FindBy(xpath="//p[normalize-space()='Save documents']") WebElement click_save ;
	@FindBy(xpath="//div[contains(@class,'v-col-sm-6 v-col-6')]//div//div[contains(@class,'text_box margin-bottom_sm margin-bottom_md')]//input[contains(@placeholder,'e.g., John')]") WebElement enter_Fname ;
	@FindBy(xpath="//div[contains(@class,'v-col-sm-6 v-col-6')]//div//div[contains(@class,'text_box margin-bottom_sm margin-bottom_md')]//input[contains(@placeholder,'e.g., Williams')]") WebElement enter_lname ;
	@FindBy(xpath="//input[@id='input-89']") WebElement enter_email ;
	@FindBy(xpath="//p[normalize-space()='Cancel']") WebElement src_confirm;
	@FindBy(xpath="//p[normalize-space()='Continue']") WebElement click_continue ;
	
	
	public void InvestorType() 
	{
		click_type.click();
	}
	public void SelectInvestorType() 
	{
		select_type.click();
	}
	public void PFType() 
	{
		click_PF.click();
	}
	public void PFContent() 
	{
		select_content.click();
	}
	public void UploadDocument() 
	{
		click_upload.click();
	}
	public void UploadGFileDocument() 
	{
		click_inv_upload.click();
	}
	public void ClickSave() 
	{
		click_save.click();
	}
	public void InputFName(String Fn) 
	{
		enter_Fname.sendKeys(Fn);
	}
	public void InputLName(String ln) 
	{
		enter_lname.sendKeys(ln);
	}
	public void InputEmail(String eml) 
	{
		enter_email.sendKeys(eml);
	}
	public void ScrollUptoCancel() 
	{
		JavascriptExecutor Js =(JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", src_confirm);
	}
	public void ClickContinue() 
	{
		//click_continue.click();
		mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(click_continue)).click();
	}
	
	
 
}
