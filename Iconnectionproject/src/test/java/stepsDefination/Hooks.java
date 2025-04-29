package stepsDefination;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import factory.ReportOpener;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver;
	Properties p;
	@Before
	public void Setup() throws IOException
	{
		BaseClass.getLogger().info("Launched chorme browser sucessfully");
		 driver = BaseClass.initilizeBrowser();
		 p = BaseClass.getProperties();
		 driver.get(p.getProperty("appURL"));
		 driver.manage().window().maximize();
		 
	}
	@After
	public void Teardown()
	{
		driver.quit();
		ReportOpener.openReport();
		BaseClass.getLogger().info("Sucessfully closed the tab");
	}
	@AfterStep
	public void addScreenshot(Scenario scenario) 
	{
		//cucumber junit report
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		
	}

}
