package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestorTablePage extends BasePage {
	
	public InvestorTablePage(WebDriver driver) 
	{
		super(driver);
	}
	//Elements
	@FindBy(xpath="//p[normalize-space()='Add investor']")  WebElement add_Investor;
	@FindBy(xpath="//div[@class='medium-overline-md uppercase side-bar-subtitle mt-2 investor-portal-main_title']") WebElement text;
	//Actions methods
	public void Click_AddInvestor() 
	{
		add_Investor.click();
	}
	public boolean InvestorTablePageExists() 
	{
		try 
		{
		return(text.isDisplayed());	
		}
		catch(Exception e)
		{
			return(false);
		}
	}

}
