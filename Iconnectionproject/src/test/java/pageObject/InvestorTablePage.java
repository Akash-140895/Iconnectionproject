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
	//Actions methods
	public void Click_AddInvestor() 
	{
		add_Investor.click();
	}

}
